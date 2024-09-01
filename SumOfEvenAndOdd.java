// class Solution10 {
//     public int[] myFun(int n) {
//         int[] arr = new int[2];

//         int oddSum = (n % 2 == 0) ? (n / 2) * (n / 2) : ((n / 2) * (n / 2)) + n;

//         int evenSum = (n * (n + 1)) / 2 - oddSum;
//         arr[0] = oddSum;
//         arr[1] = evenSum;
//         return arr;
//     }
// }

// public class SumOfEvenAndOdd {
//     public static void main(String args[]) {
//         int N = 17;

//         Solution10 obj = new Solution10();
//         int[] arr = obj.myFun(N);
//         System.out.println("sum of odd nos is: " + arr[0]); // Output: 16 20
//         System.out.println("sum of even nos is: " + arr[1]);
//     }
// }
class Solution10 {
    public int[] myFun(int N) {
        int[] arr = new int[2];
        int evensum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evensum = evensum + i;
            }
        }
        int oddsum = 0;
        for (int j = 1; j <= N; j++) {
            if (j % 2 != 0) {
                oddsum = oddsum + j;
            }
        }
        arr[0] = evensum;
        arr[1] = oddsum;
        return arr;
    }
}

public class SumOfEvenAndOdd {
    public static void main(String[] args) {

        int N = 8;
        Solution10 obj = new Solution10();
        int[] arr = obj.myFun(N);
        System.out.println("sum of even nos is: " + arr[0]); // Output: 16 20
        System.out.println("sum of odd nos is: " + arr[1]);
    }
}