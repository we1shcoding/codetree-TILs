import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt5 = 0;
        int cnt7 = 0;
        // 5의 배수인 경우와 7의 배수인 경우의 개수
        // 1줄 5배수 2줄 7배수
        for(int i = 0; i<n; i++) {
            int num = sc.nextInt();

            if(num%5==0) {
                cnt5++;
            }
            if(num % 7 == 0) {
                cnt7++;
            }
        }
        System.out.println(cnt5);
        System.out.println(cnt7);
    }
}