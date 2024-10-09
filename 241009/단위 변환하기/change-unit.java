public class Main {
    public static void main(String[] args) {
        // 상수 값 설정
        double miToCm = 160934.40; // 1마일에 해당하는 cm
        double ftToCm = 30.48; // 1피트에 해당하는 cm

        // 계산
        double milesInCm = miToCm * 2.80; // 2.80마일을 cm로 변환
        double feetInCm = ftToCm * 128.40; // 128.40피트를 cm로 변환

        // 출력 (소수 둘째자리까지 반올림)
        System.out.printf("2.80 mi = %.2f\n", milesInCm);
        System.out.printf("128.40 ft = %.2f\n", feetInCm);
    }
}