import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int value = 9-i-j;
                if(value < 1) {
                    value = 1;
                }
                System.out.print(value + " "); // 값 출력
            }
            System.out.println();
        }
    }
}