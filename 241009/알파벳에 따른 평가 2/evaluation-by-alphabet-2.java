import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);

        if(a=='S') {
            System.out.println("Superior");
        }
        else if(a=='F') {
            System.out.println("Fantastic");
        }
        else if(a=='G') {
            System.out.println("Good");
        }
        else if(a=='U') {
            System.out.println("Usually");
        }
        else if(a=='E') {
            System.out.println("Effort");
        }
        else {
            System.out.println("Failure");
        }
    }
}