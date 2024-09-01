class Solution13 {
    public int Check(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (!isPalindrome(arr[i])) {
                return 0;
            }
        }
        return 1;
    }

    public boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            int lastdigit = n % 10; // fetch last digit
            reversed = reversed * 10 + lastdigit; // add last digit at index 0 in rversed var
            n = n / 10;// remove last digit
        }
        return original == reversed;
    }
}

public class PalindromicArray {
    public static void main(String[] args) {
        int[] arr = { 222, 232, 797, 999 };

        Solution13 obj = new Solution13();
        System.out.println(obj.Check(arr));
    }
}
