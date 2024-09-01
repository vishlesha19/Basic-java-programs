public class FibonacciPyramid {
    public static void main(String[] args) {
        int currentdigit = 1;
        int nextone = 2;

        for (int i = 0; i < 4; i++) {
            for (int j = 3; j > i; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; k++) {
                System.out.print(currentdigit + " ");
                int temp = currentdigit + nextone;
                currentdigit = nextone;
                nextone = temp;
            }

            System.out.println();
        }
    }
}
