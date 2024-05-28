import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int h, w;
        double b;
        h = sc.nextInt();
        w = sc.nextInt();
        b = w * 100 * 100 / (h * h);
        if (b >= 25) {
            System.out.println((int)b);
            System.out.printf("Obesity");
        }
        else {
            System.out.println((int)b);
        }
    }
}