import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int gender, age;
        gender = sc.nextInt();
        age = sc.nextInt();

        if(gender == 0 && age >= 19) {
            System.out.println("MAN");
        }
        else if(gender == 0 && age <19) {
            System.out.println("BOY");
        }
        if(gender == 1 && age >= 19) {
            System.out.println("WOMAN");
        }
        else if(gender == 1 && age <19) {
            System.out.println("GIRL");
        }
    }
}