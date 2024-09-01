import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int medianGiver(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        if (n % 2 == 0) // if even
        {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2;
        } else {
            return arr[n / 2];
        }
    }
}

public class MedianFromArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemnts in array: ");
        int n = sc.nextInt();
        System.out.println("enter te numbers in array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // for (int i : arr) {
        // System.out.println(i);
        // }

        Solution obj = new Solution();
        int ans = obj.medianGiver(arr);
        System.out.println("Median of array is:" + ans);
    }

}
