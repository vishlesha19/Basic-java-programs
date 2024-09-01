import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        int result = 0;
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci Series up to " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            result = a + b;
            a = b;
            b = result;
        }
        System.out.println(); // Add this line to move to the next line after the loop
    }
}

// dry run
// result = 0; a = 0; b = 1;

// 1) result = 1, a = 1, b = 1
// 2) result = 2, a = 1, b = 2
// 3) result = 3, a = 2, b = 3