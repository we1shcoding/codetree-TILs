import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d / %d = %d\n",a,b,a/b);
        System.out.printf("%d * %d = %d\n",a,b,a*b);
    }
}