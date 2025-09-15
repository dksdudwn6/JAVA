import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("정수를 입력하세요: ");
            int n = sc.nextInt();
            sum += n;
            count++;
            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
        }

        sc.close();
    }
}

