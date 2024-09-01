public class StringBulderApnaClg {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // indexing
        System.out.println(sb.charAt(0));

        // replacing char
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // inserting
        sb.insert(0, "s");
        System.out.println(sb);

        // deleting
        sb.delete(0, 1);
        System.out.println(sb);

        // appending
        sb.append(" Stark");
        System.out.println(sb);
    }

}
