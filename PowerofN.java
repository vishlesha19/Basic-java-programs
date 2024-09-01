public class PowerofN {
    public static void main(String[] args) {
        // Example usage:
        int x = 2;
        int n = -3;
        System.out.println(x + " raised to the power of " + n + " is: " + power(x, n));
    }

    public static double power(int x, int n) {
        double result = 1;

        if (n == 0) {
            return result;
        } else if (n > 0) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
        } else {
            // For negative exponents
            for (int i = 0; i < -n; i++) {
                result /= x;
            }
        }

        return result;
    }
}
