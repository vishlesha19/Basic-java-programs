import java.util.*;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int bitMask = n - 1;

        if ((bitMask & n) == 0 && n != 0) {
            System.out.println("n is power of two");
        } else {
            System.out.println("n not power of two");
        }
    }

}
