import java.util.Scanner;

class Solution3 {
    public String demo(int n) {
        if (n % 2 == 0) {
            return "even";
        } else
            return "odd";
    }
}

public class EvenOrOdd {
    public static void main(String args[]) {
        System.out.print("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Solution3 obj = new Solution3();
        String ans = obj.demo(n);
        System.out.println(ans);

    }

}
