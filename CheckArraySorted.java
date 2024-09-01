import java.util.Scanner;

public class CheckArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = sc.nextInt();

        // create array
        int[] arr = new int[size];
        System.out.println("enter nos....");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for (int i = 0; i < arr.length - 1; i++) // last digit cant be compare with unexisting next one
        {
            if (arr[i] > arr[i + 1]) // current digit greater than next digit
            {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("array is sorted in ascending");
        } else {
            System.out.println("array not sorted in ascending ");
        }
    }

}
