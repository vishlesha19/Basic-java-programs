import java.util.Scanner;

public class GcdOfTwoNumers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number: ");
        int b = sc.nextInt();

        int result = gcd(a, b);
        System.out.println(result);
    }

    public static int gcd(int a, int b) {

        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;

    }

}
// import java.util.Scanner;

// public class GCD {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);

// // Input two numbers
// System.out.print("Enter the first number: ");
// int num1 = scanner.nextInt();
// System.out.print("Enter the second number: ");
// int num2 = scanner.nextInt();

// // Calculate GCD
// int gcd = findGCD(num1, num2);

// // Output the result
// System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
// }

// // Function to find GCD
// public static int findGCD(int num1, int num2) {
// // If the second number is 0, return the first number
// if (num2 == 0)
// return num1;

// // Otherwise, recursively call the function with (num2, num1 % num2)
// return findGCD(num2, num1 % num2);
// }
// }
