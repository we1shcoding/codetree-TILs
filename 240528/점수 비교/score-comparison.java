import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int mathA, engA;
        int mathB, engB;

        mathA = sc.nextInt();
        engA = sc.nextInt();

        mathB = sc.nextInt();
        engB = sc.nextInt();

        if(mathA > mathB && engA > engB) {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}