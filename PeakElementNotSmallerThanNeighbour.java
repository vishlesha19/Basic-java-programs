import java.util.Scanner;

public class PeakElementNotSmallerThanNeighbour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Solution solution = new Solution();

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int result = solution.peakElement(arr, n);
        System.out.println("Peak element's index: " + result);

        scanner.close();
    }
}

class Solution {
    public int peakElement(int[] arr, int n) {
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // If the middle element is greater than the next element,
                // a peak might be on the left side (including mid itself)
                right = mid;
            } else {
                // Otherwise, a peak might be on the right side (excluding mid)
                left = mid + 1;
            }
        }

        // When the loop exits, left == right, indicating the peak element
        return left;
    }
}
