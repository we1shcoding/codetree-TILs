import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int num;

        int sum = 0;
        double avg;
        int cnt = 0;

        for(int i = 1; i <=10; i++) {
            num = sc.nextInt();
            if(num >= 0 && num<=200) {
                sum += num;
                cnt++;
            }

        }            
        avg = (double)sum/cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}