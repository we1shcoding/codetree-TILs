import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];
        int k = 0;

        for(int i = 0; i<100; i++) {
            num[i] = sc.nextInt();

            if(num[i]==0) {
                k = i;
                break;
            }
        }
        System.out.print(num[k - 3] + num[k - 2] + num[k - 1]);
    }
}