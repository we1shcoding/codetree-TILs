import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
        int prod = 1;
        for(int i =a; i<=b; i++) {
            prod *= i;
        }
        System.out.println(prod);
    }
}