// import java.util.Scanner;

// public class demo {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// Solution solution = new Solution();

// System.out.print("Enter the number of strings: ");
// int n = scanner.nextInt();
// scanner.nextLine(); // Consume the newline character

// String[] arr = new String[n];
// System.out.println("Enter the strings:");

// for (int i = 0; i < n; i++) {
// arr[i] = scanner.nextLine();
// }

// String result = solution.longestCommonPrefix(arr, n);
// System.out.println("Longest common prefix: " + result);

// scanner.close();
// }
// }

// class Solution {
// String longestCommonPrefix(String arr[], int n) {
// if (n == 1)
// return arr[0];
// String res = "";
// boolean include;
// for (int i = 0; i < arr[0].length(); ++i) {
// include = true;
// for (int j = 1; j < n; ++j) {
// // checking if the current character arr[0][i] is eligible
// // for being included in the result or not
// if (i >= arr[j].length() || arr[0].charAt(i) != arr[j].charAt(i)) {
// include = false;
// break;
// }
// }
// // if it can't be included, we need not check the further characters
// if (!include)
// break;
// // if it can be included, we include it and check ahead
// res += arr[0].charAt(i);
// }
// if (res.equals(""))
// return "-1";
// return res;
// }
// }

import java.util.Scanner;

class Solution {
    public String longestPrefix(String arr[], int n) {
        if (n == 1) // If only one word in array, that's the longest prefix
            return arr[0];

        String res = ""; // Initialize result variable
        boolean include; // To check whether to include the character or not

        for (int i = 0; i < arr[0].length(); ++i) { // Iterate each letter from the first word
            include = true; // Initial status is true
            for (int j = 1; j < n; j++) { // Compare letters from words of array starting from the 2nd position
                if (i >= arr[j].length() || arr[0].charAt(i) != arr[j].charAt(i)) // see if there are letters available
                                                                                  // to match , or check that
                // letters match or not
                { // If not a match
                    include = false; // Status becomes false
                    break; // Loop breaks
                }
            }
            if (!include) { // If the letter is not matched, break
                break;
            }
            res = res + arr[0].charAt(i); // If matched, add it to the result and move to next letter
        }
        return res; // Return result
    }
}

class prefix {
    public static void main(String[] args) {
        System.out.println("Enter the number of words in array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] arr = new String[n]; // Create array of size n
        System.out.println("Enter the words in array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        Solution sol = new Solution();
        String result = sol.longestPrefix(arr, n);
        System.out.println("Longest prefix is: " + result);
    }
}
