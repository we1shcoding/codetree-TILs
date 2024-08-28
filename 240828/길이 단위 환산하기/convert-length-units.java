import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        double ft;
        ft = sc.nextDouble();
        System.out.printf("%.1f", ft*30.48);
    }
}