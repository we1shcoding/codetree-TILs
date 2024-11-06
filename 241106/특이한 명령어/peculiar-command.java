import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 명령어의 개수를 입력받음

        for(int i = 0; i<n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            char c = sc.next().charAt(0);

            if(c == 's') {
                int sa = a*b;
                System.out.println(sa);
            }
            else if(c == 't') {
                double sam = a*b*0.5;
                System.out.printf("%.1f\n", sam);
            }
        }
    }
}