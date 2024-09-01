import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of 2D array");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("enter nos...");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }

        System.out.println("enter no. to see its index: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == x) {
                    System.out.println("[" + i + "," + j + "]");
                }
            }
        }
    }

}
