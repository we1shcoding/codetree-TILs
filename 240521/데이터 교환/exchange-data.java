public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5;
        int b = 6;
        int c = 7;
        int temp = a;
        a = c;
        c = b;
        b = temp;


        System.out.println(a); // 7
        System.out.println(b); // 5
        System.out.println(c); // 6
    }
}