import java.util.*;

public class ForQuery {
    public static void main(String[] args) {

        // strings are immutable
        String str = "Vishlesha";
        // String str = "Ritesh";
        System.out.println(str);

        StringBuilder str2 = new StringBuilder();

        Scanner sc = new Scanner(System.in);

        // nextInt() doesont move cursor to the next line,
        // if you enter numers in space it will stroe them in different variables
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a);
        System.out.println(b);

        // next()
        String name = sc.next();
        String bf = sc.next();
        System.out.println(name + " " + bf);

        // nextLine()
        String daughter = sc.nextLine();
        String surname = sc.nextLine();
        System.out.println(daughter + " " + surname);
    }

}
