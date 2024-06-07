import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a,b;
        int sum = 0;
        int cnt = 0;
        double avg;
        a = sc.nextInt();
        b = sc.nextInt();

        for(int i = a; i<=b; i++){
            if(i%5==0 || i%7==0) {
                sum += i;
                cnt++;
            }
        }
                avg = (double)sum / cnt;

        // 출력
        System.out.printf("%d %.1f", sum, avg);
    }
}