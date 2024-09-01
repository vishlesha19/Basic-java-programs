import java.util.Scanner;

public class InfiniteLoop {
    // public static void main(String[] args) {
    // do {
    // System.out.printlhn("This is an infinite loop!");
    // } while (true);
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zerosCount = 0;

        char choice;
        do {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();

            if (number >= 0) {
                positiveCount++;
            } else if (number <= 0) {
                negativeCount++;
            } else {
                zerosCount++;
            }

            System.out.println("do you wnt to enter another number? (y/n)");
            choice = sc.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

        System.out.println("count of Positive Integers: " + positiveCount);
        System.out.println("count of Negative Integers: " + negativeCount);
        System.out.println("Count of zeros" + zerosCount);

        sc.close();

    }

}
