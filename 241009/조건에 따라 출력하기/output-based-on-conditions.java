import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();

            if(num==0)
            {
                break;
            }
            
            if(num%3==0)
            {
                num/=3;
                System.out.println(num);
            }
            else {
                num+=2;
                System.out.println(num);
            }
        }
    }
}