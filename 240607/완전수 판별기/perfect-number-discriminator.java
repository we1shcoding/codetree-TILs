import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        n = sc.nextInt();

        for(int i = 1; i < n; i++) {
            if(n%i==0)
                sum+=i;
        }
        if(sum==n)
            System.out.print("P");
        else
            System.out.print("N");
    }
}