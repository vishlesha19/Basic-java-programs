// public class RemoveSpaces {
//     public static void main(String[] args) {
//         String s = "g e e k s f o r g e e k s";
//         StringBuilder sb = new StringBuilder();

//         char[] arr = s.toCharArray();
//         for (int i = 0; i < s.length(); i++) {
//             if (arr[i] != ' ') {
//                 sb.append(arr[i]);
//             }
//         }

//         System.out.println(sb);
//     }

// }
public class RemoveSpaces {
    public static void main(String[] args) {
        String s = "g e e k s f o r g e e k s";
        char[] arr = s.toCharArray();

        int tillIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                arr[tillIndex] = arr[i];
                tillIndex++;
            }
        }
        String result = new String(arr, 0, tillIndex);
        System.out.println(result);
    }
}