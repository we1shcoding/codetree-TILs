import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int i, n;
        n = sc.nextInt();
        i = n;
        while(i >= 1) {
            System.out.print(i + " ");
            i--;
        }
    }
}