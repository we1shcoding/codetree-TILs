import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = 0;

        for(int i = 0; i<n; i++)
        {
            double grade = sc.nextDouble();
            sum += grade;          
        }
        

    double avg = (double)sum / n;
    System.out.printf("%.1f\n", avg);

    if(avg >= 4.0)
    {
        System.out.println("Perfect");
    }
    else if(avg >= 3.0)
    {
        System.out.println("Good");
    }
    else
    {
        System.out.println("Poor");
    }
        
    }
}