import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
            int mathA, engA;
            int mathB, engB;
            mathA = sc.nextInt();
            engA = sc.nextInt();
            mathB = sc.nextInt();
            engB = sc.nextInt();
// 영어 점수와 상관없이 수학점수가 높다면 더 높은 학생의 이름 출력
// 수학점수가 같다면 영어점수가 더 높은 학생 이름 출력
            if(mathA > mathB || (mathA == mathB && engA > engB)) {
                System.out.println("A");
            }
            else {
                System.out.println("B");
            }
        }
    }