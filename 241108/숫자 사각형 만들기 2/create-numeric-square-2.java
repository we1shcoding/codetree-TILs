import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력을 받아 n과 m을 저장
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 시작 숫자를 n * m으로 설정
        int current = n * m;

        // n행과 m열에 맞춰 숫자 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(current + " ");
                current--; // 숫자 1씩 감소
            }
            System.out.println(); // 줄바꿈
        }
    }
}