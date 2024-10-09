import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 자연수의 개수 입력
        int n = sc.nextInt();

        // 첫 번째 자연수 입력
        int firstNum = sc.nextInt();
        int gcdValue = firstNum; // GCD 초기값은 첫 번째 숫자로 설정

        // 두 번째 또는 세 번째 자연수 입력
        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();
            gcdValue = gcd(gcdValue, num); // GCD 갱신
        }

        // GCD의 모든 공약수 출력
        for (int i = 1; i <= gcdValue; i++) {
            if (gcdValue % i == 0) {
                System.out.println(i); // 공약수 출력
            }
        }
    }

    // 두 수의 최대 공약수를 구하는 메서드
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // GCD 반환
    }
}