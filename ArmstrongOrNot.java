public class ArmstrongOrNot {
    public void isArmstrong(String n) {
        char[] s = n.toCharArray();
        int size = s.length;
        int sum = 0;

        for (char num : s) {
            int temp = 1;
            int i = Integer.parseInt(Character.toString(num));

            for (int j = 0; j <= size - 1; j++) {
                temp *= i;
            }
            sum += temp;
        }

        if (sum == Integer.parseInt(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    // Driver Code
    public static void main(String[] args) {
        ArmstrongOrNot am = new ArmstrongOrNot();
        am.isArmstrong("153");
        am.isArmstrong("1253");
    }
}
