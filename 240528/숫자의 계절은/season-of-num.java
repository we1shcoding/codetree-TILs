import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        if(a>=12 || a<=2) {
            System.out.println("Winter");
        }
        else if(a<=5) {
            System.out.println("Spring");
        }
        else if(a<=8) {
            System.out.println("Summer");
        }
        else {
            System.out.println("Fall");
        }
    }
}