import java.util.Scanner;

public class SumOfOddNo {

    public static int sum(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                sum += i; // Corrected this line
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sum(n);
        System.out.println(sum);
    }
}
