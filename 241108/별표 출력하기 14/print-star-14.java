import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // n의 값 받기
        // 별표 출력
        // 2를 입력 받으면
        // *
        // **
        for(int i = 0; i<n; i++) {
            for(int j = 0; j<=i; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
    }
}