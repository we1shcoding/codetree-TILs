import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt1 = 0;
        int cnt2 = 0;

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if(num==0) {
                break;
            }
            else if(num % 2 == 0) {
                cnt1++;
            }
            else {
                cnt2++;
            }
        }
        System.out.println(cnt1);
        System.out.println(cnt2);
    }
}