// public class java1 {
//     public String reverseWords(String S) {
//         // Split the input string by dots to get individual words
//         String[] words = S.split("\\.");

//         // Reverse the array of words
//         int left = 0; // start
//         int right = words.length - 1; // last
//         while (left < right) {
//             // Swap words at left and right indices
//             String temp = words[left];
//             words[left] = words[right];
//             words[right] = temp;
//             left++;
//             right--;
//         }

//         // Join the reversed words with dots and return
//         return String.join(".", words);
//     }

//     public static void main(String[] args) {
//         java1 solution = new java1();

//         // Test cases
//         String S1 = "i.like.this.program.very.much";
//         String S2 = "pqr.mno";

//         System.out.println(solution.reverseWords(S1)); // Output: much.very.program.this.like.i
//         System.out.println(solution.reverseWords(S2)); // Output: mno.pqr
//     }
// }

class MyClass {
    public String[] reverseString(String s) {
        String[] ss = s.split("\\.");

        // pointers
        int i = 0;
        int j = ss.length - 1;

        // swapping
        while (i < j) {
            String temp = ss[i];
            ss[i] = ss[j];
            ss[j] = temp;
            i++;
            j--;
        }
        return ss;
    }
}

public class reverse {

    public static void main(String[] args) {
        String s = "i.like.you.ritesh.my.baby";
        MyClass obj = new MyClass();
        String[] ss = obj.reverseString(s);
        for (String sss : ss) {
            System.out.print(sss + ".");
        }

    }

}
