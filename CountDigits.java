class Solution11 {
    public int myFun(int N) {
        int count = 0; // counting digits dividing whole no.
        int num = N; // copy of og no.
        while (num > 0) {
            int currentdigit = num % 10; // the last digit
            if (currentdigit != 0 && N % currentdigit == 0) // if last digit is nonzero and able to divide the no.
            {
                count++; // then count++
            }
            num = num / 10; // remove last digit go to next one
        }
        return count; // finally return the count
    }
}

class CountDigits {
    public static void main(String args[]) {
        int N = 12; // output 2
        Solution11 obj = new Solution11();
        System.out.println(obj.myFun(N));
    }
}