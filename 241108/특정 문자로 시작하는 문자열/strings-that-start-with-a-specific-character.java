import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // n 입력
        int n = sc.nextInt();
        sc.nextLine(); // 엔터키 제거

        // 문자열들 입력
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = sc.nextLine();
        }

        // 조건이 되는 알파벳 입력
        char targetChar = sc.nextLine().charAt(0);

        // 시작하는 문자열 개수와 길이의 합을 계산
        int count = 0;
        int lengthSum = 0;

        for (String str : strings) {
            if (str.charAt(0) == targetChar) {
                count++;
                lengthSum += str.length();
            }
        }

        // 평균 길이 계산
        double averageLength = (double) lengthSum / count;

        // 출력
        System.out.printf("%d %.2f\n", count, averageLength);

        sc.close();
    }
}