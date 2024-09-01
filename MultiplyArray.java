class Solution9 {
    public static int product(int arr[], int n) {
        int mul = 1;
        for (int i = 0; i < n; i++) {
            mul = mul * arr[i];
        }
        return mul;
    }
}

public class MultiplyArray {
    public static void main(String[] args) {

        int[] arr = { 5, 2, 3, 4, 8, 9, 33 };
        Solution9 obj = new Solution9();
        System.out.println(obj.product(arr, 7));

    }
}
