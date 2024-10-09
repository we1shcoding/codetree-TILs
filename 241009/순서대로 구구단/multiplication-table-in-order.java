import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a와 b 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a가 b보다 크면 두 값을 교환
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // 구구단 출력
        for (int i = 1; i <= 9; i++) {
            for (int j = a; j <= b; j++) {
                System.out.printf("%d * %d = %d  ", j, i, j * i);
            }
            System.out.println(); // 각 곱셈 결과를 출력한 후 줄 바꿈
        }
    }
}