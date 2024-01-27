package Kyu_7;

public class Name_that_Number {
    public static void main (String[] args) {

        int x = 19;

        String result = "";
        String toString = String.valueOf(x);

        System.out.println("Number is: " + x);

        String[] firsts = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};

        String[] tys = new String[] {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy",
                "eighty", "ninety"};

        if (x < 20) {
            System.out.println(firsts[x]);
            result = firsts[x];
        }

        if (x > 20) {
            char first_digit = toString.charAt(0);
            char second_digit = toString.charAt(1);
            int b = Integer.parseInt(String.valueOf(second_digit));

            if (first_digit == '2') {
                result = tys[2];
            }
            if (first_digit == '3') {
                result = tys[3];
            }
            if (first_digit == '4') {
                result = tys[4];
            }
            if (first_digit == '5') {
                result = tys[5];
            }
            if (first_digit == '6') {
                result = tys[6];
            }
            if (first_digit == '7') {
                result = tys[7];
            }
            if (first_digit == '8') {
                result = tys[8];
            }
            if (first_digit == '9') {
                result = tys[9];
            }

            if (b >=1 && b < 10) {
                result = result + " " + firsts[b];
            }
        }

        System.out.println("Final result is " + result);

    }
}
