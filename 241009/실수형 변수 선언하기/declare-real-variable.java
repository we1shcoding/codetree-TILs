public class Main {
    public static void main(String[] args) {
        // 두 개의 실수형 변수 선언 및 초기화
        double num1 = 12.3;
        double num2 = 70;
        
        // 두 수의 합 계산
        double sum = num1 + num2;

        // 소수 둘째자리까지 출력하고 각 숫자 사이에 5개의 공백 삽입
        System.out.printf("%.2f     %.2f     %.2f\n", num1, num2, sum);
    }
}