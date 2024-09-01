import java.util.*;

public class ArrayLinearSearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int n = sc.nextInt();

        // create array of given size
        int arr[] = new int[n];

        System.out.println("enter numbers: ");

        // input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("enter number to search its index: ");
        int x = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("the number " + x + " is at index " + i);
                break;
            }

        }
    }
}
