// import java.util.Scanner;
// //problem in this code is for  098767890 this input it give false as output
// //Java interprets it as 98767890 because integer literals do not 
// //preserve leading zeros. So, when you enter 098767890, it's treated as 98767890.

// class Solution12 {
//     public boolean isPalindrome(int N) {
//         if (N < 0) {
//             return false;
//         }
//         int original = N;
//         int reverse = 0;

//         while (N > 0) {
//             int lastdigit = N % 10; // took last digit
//             reverse = reverse * 10 + lastdigit; // like we adding new digit in loop to the revesed no.
//             N = N / 10; // remove last digit from n
//         }
//         return original == reverse;
//     }
// }

// public class PalindromOrNot {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter the number: ");
//         int N = sc.nextInt();
//         Solution12 obj = new Solution12();
//         boolean ans = obj.isPalindrome(N);
//         System.out.println(ans);
//     }

// }
import java.util.Scanner;

class Solution12 {
    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class PalindromOrNot {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String number = sc.nextLine();

        Solution12 obj = new Solution12();
        boolean ans = obj.isPalindrome(number);
        System.out.println(ans);
    }
}
