import java.util.Scanner;

class Check {
    public boolean isPalindrome(int n, int[] arr) {
        int length = n;
        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                return false;
            }
        }
        return true;

    }
}

public class ArrayPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elements in array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("enter" + i + "no.");
            arr[i] = sc.nextInt();
        }

        Check obj = new Check();
        if (obj.isPalindrome(n, arr)) {
            System.out.println("array is palindromic");
        } else {
            System.out.println("array is not palindromic");
        }
    }

}
