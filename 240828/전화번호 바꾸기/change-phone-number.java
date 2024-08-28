import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int num1;
        int num2;
        int num3;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        System.out.println("010"+"-"+num3+"-"+num2);
    }
}