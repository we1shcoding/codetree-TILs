import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int count = 0;
        int sum = 0;
        int value = 1000;

        for (int even = 2; value > n; even += 2) {
            value -= even;
            sum += even;
            count++;
        }

        System.out.println(count + " " + sum);
    }
}