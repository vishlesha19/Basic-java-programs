// public class roman {
// public int romanToDecimal(String s) {
// int result = 0;
// int prevValue = 0;

// for (int i = s.length() - 1; i >= 0; i--) {
// int curValue = getValue(s.charAt(i));

// if (curValue < prevValue) {
// result = result - curValue;
// } else {
// result += curValue;
// }

// prevValue = curValue;
// }

// return result;
// }

// private int getValue(char c) {
// switch (c) {
// case 'I':
// return 1;
// case 'V':
// return 5;
// case 'X':
// return 10;
// case 'L':
// return 50;
// case 'C':
// return 100;
// case 'D':
// return 500;
// case 'M':
// return 1000;
// default:
// return 0;
// }
// }

// public static void main(String[] args) {
// roman solution = new roman();
// System.out.println(solution.romanToDecimal("V")); // Output: 5
// System.out.println(solution.romanToDecimal("III")); // Output: 3
// System.out.println(solution.romanToDecimal("IV")); // 4
// }
// }

//my code
class Roman {
    public int romantoint(String s) {
        int result = 0; // later to sum all digit
        int prevValue = 0; // prev value so to check if prev value is big or small then curvalue
        for (int i = s.length() - 1; i >= 0; i--) // stsrt loop from last char of string
        {
            int curValue = getValue(s.charAt(i));
            if (prevValue > curValue) {
                result = result - curValue;
            } else {
                result = result + curValue;
            }

            prevValue = curValue;
        }

        return result;

    }

    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}

public class RomanDemo {
    public static void main(String[] args) {
        Roman obj = new Roman();
        System.out.println(obj.romantoint("IX"));

    }
}