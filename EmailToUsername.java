public class EmailToUsername {
    public static void main(String[] args) {
        String mail = "vishleshaw19@gmail.com";
        String username = "";
        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                break;
            } else {
                username += mail.charAt(i);
            }
        }
        System.out.println(username);
    }
}
