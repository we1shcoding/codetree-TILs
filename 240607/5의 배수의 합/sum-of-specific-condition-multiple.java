import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = 0;

        if(a>b) {
            for(int i = b; i <=a; i++) {
                if(i%5==0) 
                    sum += i;                  
                }
            }
            else if(a<b) {
                for(int i =a; i<=b; i++) {
                    if(i%5==0)
                        sum+=i;
                    }
                }
                System.out.println(sum);
            }
        }