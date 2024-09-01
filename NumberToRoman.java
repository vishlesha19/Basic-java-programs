class Roman {
    public String intToRoman(int num) {
        int[] numbers = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String[] roman = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

        StringBuilder solution = new StringBuilder();

        for (int i = roman.length - 1; i >= 0; i--) {
            while (num >= numbers[i]) {
                solution.append(roman[i]);
                num = num - numbers[i];

            }
        }
        return solution.toString();

    }
}

public class NumberToRoman {
    public static void main(String[] args) {

        Roman obj = new Roman();
        String que = obj.intToRoman(133);
        System.out.println(que);
    }
}
