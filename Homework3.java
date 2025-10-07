import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("수를 입력하세요: ");
        nums[0] = sc.nextInt();
        int min = nums[0];
        int max = nums[0];

        for (int i = 1; i < n; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        sc.close();
    }
}
