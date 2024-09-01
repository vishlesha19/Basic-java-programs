class solution7 {
    public String myfun(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return "YES";
        } else
            return "NO";
    }
}

public class VovelOrNot {

    public static void main(String args[]) {
        solution7 obj = new solution7();
        String ans = obj.myfun('A');
        System.out.println(ans);

    }
}
