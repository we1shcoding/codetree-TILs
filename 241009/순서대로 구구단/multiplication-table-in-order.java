import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 1; i <=9; i++)
        {
            if(a<b) {
                System.out.printf("%d * %d = %d  ",a,i,a*i);
                System.out.printf("%d * %d = %d\n",b,i,b*i);
            }
            else {
                System.out.printf("%d * %d = %d  ",a,i,a*i);
                System.out.printf("%d * %d = %d\n",b,i,b*i);
            }
        }
    }
}