class Solution8 {
    public String lowertoupper(String str) {
        char[] myarr = str.toCharArray();

        for (int i = 0; i < myarr.length; i++) {
            if (myarr[i] >= 'a' && myarr[i] <= 'z') {
                myarr[i] = (char) (myarr[i] - 'a' + 'A');
                // here apan adhi existing character mdhun 'a' chi ascii
                // minus kartoy let say 'c' chya
                // value mdhun apan 'a' minus kel value ali 2 mg
                // 'A' chya mdhe 2 add kel tar bhetel 'C' chi value
            }
        }

        return new String(myarr); // we can actually
        // covert our array by using inbuilt constructor of
        // class String by passing our array as parameter
    }
}

public class LowerToUpperCase {
    public static void main(String args[]) {
        String example = "ritesh katkar";

        Solution8 obj = new Solution8();
        String ans = obj.lowertoupper(example);
        System.out.println(ans);

    }

}