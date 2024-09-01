import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution4 {
    public List<Integer> sol(int a, int b) {
        List<Integer> mylist = new ArrayList<>();
        int temp = a;
        a = b;
        b = temp;

        mylist.add(a);
        mylist.add(b);

        return mylist;
    }
}

public class SwapTwoNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number 1: ");
        int a = sc.nextInt();
        System.out.print("enter no. 2: ");
        int b = sc.nextInt();

        Solution4 obj = new Solution4();
        List<Integer> ans = obj.sol(a, b);
        System.err.println(ans.get(0) + " " + ans.get(1));

    }

}
