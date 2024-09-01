import java.util.Scanner;

public class Prime {
    public static Boolean isPrime(int N) {
        if (N <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println(n + "is a prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
