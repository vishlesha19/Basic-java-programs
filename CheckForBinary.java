import java.util.Scanner;

class Solution1 {
    public Boolean check(String str) {
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }
}

public class CheckForBinary {
    public static void main(String args[]) {
        System.out.println("eneter a number: ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        Solution1 obj = new Solution1();
        Boolean ans = obj.check(n);
        if (ans == false) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }

    }

}
