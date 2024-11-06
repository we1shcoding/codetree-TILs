import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg;
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i<n; i++) {
            int num = sc.nextInt();
            sum+=num;
            cnt++;
            
        }
        avg = (double)sum/cnt;
        
            if(avg >= 70) {
                System.out.printf("%.1f\n", avg);
            }
            if(avg <70) {
                System.out.printf("%.1f\n", avg);
                System.out.println("fail");
            }

        }
    }