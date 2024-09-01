import java.util.Scanner;

class Solution6 {
    public int sum(int N, int M, int[][] arr) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}

public class Sumofelementsinmatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows (N): ");
        int N = sc.nextInt();
        System.out.print("enter no. of columns (M): ");
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        System.out.println("enter the numbers of matrix");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        Solution6 obj = new Solution6();
        int sum = obj.sum(N, M, arr);
        System.out.println(sum);

    }

}
