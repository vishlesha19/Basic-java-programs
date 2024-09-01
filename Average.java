// import java.util.Scanner;

// public class Average {
//     public static int avg(int n, int m, int o) {
//         return (n + m + o) / 3;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("enter no. 1");
//         int n1 = sc.nextInt();
//         System.out.println("enter no. 2");
//         int n2 = sc.nextInt();
//         System.out.println("enter no. 3");
//         int n3 = sc.nextInt();
//         int avg = avg(n1, n2, n3);
//         System.out.println(avg);
//     }

// }
import java.util.Scanner;

public class Average {
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }
}
