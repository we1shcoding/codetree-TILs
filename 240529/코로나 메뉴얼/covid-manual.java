import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char c1, c2, c3;
        int t1, t2, t3;
        c1 = sc.next().charAt(0);
        t1 = sc.nextInt();
        c2 = sc.next().charAt(0);
        t2 = sc.nextInt();
        c3 = sc.next().charAt(0);
        t3 = sc.nextInt();

        // A가 2명 이상인지 판단하기
        if(c1 == 'Y' && t1 >= 37) {
            // 첫 번째 사람이 A라면, 남은 두 사람 중 한 사람이라도 A면 됩니다.
            if((c2 == 'Y' && t2 >= 37) || (c3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
        else {
            // 첫 번째 사람이 A가 아니라면, 남은 두 사람 모두 A여야만 합니다.
            if((c2 == 'Y' && t2 >= 37) && (c3 == 'Y' && t3 >= 37))
                System.out.println("E");
            else
                System.out.println("N");
        }
    }
}