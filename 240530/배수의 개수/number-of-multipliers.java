import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int cnt3 = 0;
        int cnt5 = 0;
        for(int i = 1; i <= 10; i++) {
            int a;
            a = sc.nextInt();
            if(a%3 == 0) {
                cnt3++;
            }
            if(a%5==0) {
                cnt5++;
            }
        }
        System.out.print(cnt3 + " " + cnt5);
    }
}