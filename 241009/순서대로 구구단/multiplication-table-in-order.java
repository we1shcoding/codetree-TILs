import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a와 b 입력받기
        int a = sc.nextInt();
        int b = sc.nextInt();

        // a가 b보다 클 경우 swap
        if (a > b) {
            for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d  ", a, i, a * i); // a의 구구단 출력
                System.out.printf("%d * %d = %d%n", b, i, b * i); // b의 구구단 출력
            }
        }
        else {
                   for (int i = 1; i <= 9; i++) {
                System.out.printf("%d * %d = %d  ", a, i, a * i); // a의 구구단 출력
                System.out.printf("%d * %d = %d%n", b, i, b * i); // b의 구구단 출력
            }
        }

        // 구구단 출력

    }
}