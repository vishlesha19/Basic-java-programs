import java.util.Scanner;

class Check {
    public int checkpalindrome(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit of n to sum
            n /= 10; // Remove the last digit from n
        }

        String sumString = String.valueOf(sum);
        int left = 0;
        int right = sumString.length() - 1;
        while (left < right) {
            if (sumString.charAt(left) != sumString.charAt(right)) {
                return 0;
            }
            left++;
            right--;
        }

        return 1;
    }
}

public class SumOfDigitPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Check obj = new Check();
        System.out.println(obj.checkpalindrome(n));
    }
}
