import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int a = sc.nextInt();
        int i;
        i=b;
        while(i>=a) {
            System.out.print(i+" ");
            i-=2;
        }
    }
}