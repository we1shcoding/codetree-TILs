import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();

        if(grade>=90) {
            System.out.println("passed");
        }
        else {
            System.out.println("need "+ (90-grade) + " more score");
        }
    }
}