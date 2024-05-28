import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int grade1, grade2;
        grade1 = sc.nextInt();
        grade2 = sc.nextInt();

        if(grade1 >= 90 && grade2 >= 95)
        {
            System.out.println("100000");
        }
        else if(grade1 >= 90 && grade2>=90) {
            System.out.println("50000");
        }
        else {
            System.out.println("0");
        }
    }
}