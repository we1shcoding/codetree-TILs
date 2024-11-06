import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        double avg;
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if(num%5== 0 || num%7==0) {
                continue;
            }
            cnt++;
            sum += num;
            
        }
        avg = (double)sum / cnt;

        System.out.println(sum);
        System.out.printf("%.1f", avg);
    }
}