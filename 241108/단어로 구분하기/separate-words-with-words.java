import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] c = s.split(" ");

        for(int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}