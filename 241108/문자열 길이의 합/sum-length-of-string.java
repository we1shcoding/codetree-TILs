import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        int sum = 0;
        for(int i = 0; i<n; i++) {
            String s = sc.next();
            sum += s.length();
            if(s.startsWith("a")) {
                cnt++;
            }
        }
        System.out.printf("%d %d", sum, cnt);
    }
}