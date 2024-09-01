import java.util.Scanner;

class Function {
    public void fact(int n) {
        if (n < 0) {
            System.out.println("invalid no.");
            return;
        }
        int factoral = 1;
        for (int i = n; i >= 1; i--) {
            factoral = factoral * i;
        }
        System.out.println(factoral);
    }
}

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Function obj = new Function();
        obj.fact(n);

    }

}
