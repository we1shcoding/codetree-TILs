import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a, b,c, d;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = a+b;
        d = a-b;
        System.out.printf("%.2f", c/d);
    }
}