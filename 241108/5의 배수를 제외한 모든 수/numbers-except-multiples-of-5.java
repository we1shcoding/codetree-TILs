import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); // 정수 x 주어짐
        int y = sc.nextInt(); // 정수 y 주어짐
        int sum = 0;
        int cnt = 0;
        // 사이에 있는 5의 배수를 제외한
        // 모든 수들의 합과 평균을 구하기

        int start = Math.min(x,y);
        int end = Math.max(x,y);

        for(int i = start; i <= end; i++) {
            if(i%5!=0) {
                sum+=i;
                cnt++;
            }
        }
        double avg = (double)sum/cnt;
        System.out.printf("%d %.1f", sum,  avg);
    }
}