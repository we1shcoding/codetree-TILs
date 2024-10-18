import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        // 500 이하 정수 10번, 250이상 정수 주어지면
        // 그거 제외하고 정수등릐 합과 평균을 구함
        int[] num = new int[10];
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i<10; i++)
        {
            num[i] = sc.nextInt();
        }

        // 10개의 정수 중 250 이상의 수가 나올 때 까지의 수의 합계와 개수를 구합니다.
        for(int i = 0; i < 10; i++) {
            if(num[i]>=250)
                break;
            sum+=num[i];
            cnt++;
        }
        double avg = (double)sum/cnt;
        System.out.printf("%d %.1f", sum, avg);
    }
}