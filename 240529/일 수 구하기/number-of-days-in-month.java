import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언
        int n;
        
        // 입력
        n = sc.nextInt();

        // 출력
        if(n==2 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
            System.out.println("30");
        }else{
            System.out.println("31");
        }
    }
}