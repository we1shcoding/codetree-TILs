import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter(":");
        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();
        System.out.printf((h+1) + ":"+m);
    }
}