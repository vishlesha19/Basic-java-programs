class Solution5 {
    public int sol(int n) {
        int sum = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        return sum;
    }
}

public class SumOfDigits {
    public static void main(String[] args) {

        int n = 2000;
        Solution5 obj = new Solution5();
        int ans = obj.sol(n);
        System.out.println(ans);
    }
}
