import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n;
        char c;
        c = sc.next().charAt(0);
        n = sc.nextInt();

        if(c == 'A') {
            for(int i = 1; i <=n; i++) {
                System.out.print(i + " ");
            }
        }
        if (c == 'D') {
            for(int i = 1; i<=n; i--) {
                System.out.print(i + " ");
            }
        }
    }
}