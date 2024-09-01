import java.util.*;

public class TransposeMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of rows");
        int row = sc.nextInt();
        System.out.println("enter the no. of cols");
        int cols = sc.nextInt();

        int arr[][] = new int[row][cols];
        System.out.println("enter no.s of 2d array: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("transpose of matrix : ");
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
