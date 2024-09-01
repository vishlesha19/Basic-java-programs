import java.util.*;

public class LengthOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many strings in array? ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        int stringlength = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("enter " + (i + 1) + "no. of array");
            arr[i] = sc.next();
            stringlength += arr[i].length();
        }

        System.out.println("array of string is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("length of all strings is : " + stringlength);
    }

}
