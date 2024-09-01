import java.util.Scanner;

class Solution {
    public long sum(int n) {
        return ((long) n * (n + 1)) / 2;

    }

}

public class SumOfSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter  num: ");
        int n = sc.nextInt();

        Solution obj = new Solution();
        long ans = obj.sum(n);
        System.out.println(ans);

    }
}
