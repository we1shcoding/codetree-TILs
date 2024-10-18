import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        int cnt = 0;
        double avg = 0;

        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            if(arr[i] % 2 == 0)
            {
                sum1 += arr[i];
            }

            if(arr[i] % 3 == 0)
            {
                sum2+=arr[i];
                cnt++;  
            }
            avg = (double) sum2/cnt;
        }
        System.out.printf("%d %.1f",sum1,avg);


    }
}