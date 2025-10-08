import java.util.Scanner;

public class Homework4 {

    static int gcd(int m, int n) {
        m = Math.abs(m);
        n = Math.abs(n);
        if (n == 0) return m;
        return gcd(n, m % n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int g = gcd(a, b);
        System.out.println("두 수의 최대공약수는 " + g + "입니다.");
    }
}
