import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();

        if(a>=3 && a<=5) {
            System.out.println("Spring");
        }
        else if(a>=6 && a<=9) {
            System.out.println("Summer");
        }
        else if(a>=9 && a<=11) {
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }
    }
}