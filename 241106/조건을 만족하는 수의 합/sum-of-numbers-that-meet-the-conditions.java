import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;

        for(int i = n; i <= 500; i++) {
            if(i%2==0) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}