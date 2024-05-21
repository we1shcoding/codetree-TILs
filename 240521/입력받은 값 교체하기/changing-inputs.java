import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp;
        temp = a; // temp에 14 드감
        a = b; // a에 5 드감
        b = temp;
        System.out.println(a+" "+b);
    }
}