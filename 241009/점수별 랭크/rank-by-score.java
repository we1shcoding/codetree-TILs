import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if(grade>=90) {
            System.out.println("S");
        }
        else if(grade>=80) {
            System.out.println("A");
        }
        else if(grade>=70) {
            System.out.println("B");
        }
        else if(grade>=60) {
            System.out.println("C");
        }
        else {
            System.out.println("F");
        }
    }
}