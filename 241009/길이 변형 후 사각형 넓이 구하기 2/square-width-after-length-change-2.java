import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int s = sc.nextInt();

        r*=4;
        s+=3;

        System.out.println(r);
        System.out.println(s);
        System.out.println(r*s);
    }
}