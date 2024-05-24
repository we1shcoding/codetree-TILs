import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\-");
        String num1 = "010";
        num1 = sc.next();
        int num2, num3;
        num2 = sc.nextInt();
        num3 = sc.nextInt();
        System.out.println(num1+"-"+num3+"-"+num2);
    }
}