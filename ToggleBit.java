import java.util.*;

public class ToggleBit {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 5; // 0101
        int pos = 1; // 0111
        int bitMask = 1 << pos; // 0010
        // Toggle the bit at position pos
        int result = n ^ bitMask; // 0101 ^ 0010 = 0111

        System.out.println("Original number: " + n);
        System.out.println("Number after toggling bit at position " + pos + ": " + result);
    }
}
