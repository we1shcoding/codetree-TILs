import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] arr = s.split(" ");

        for(int i = arr.length - 1; i>=0; i--) {
            System.out.println(arr[i]);
        }
    }
}