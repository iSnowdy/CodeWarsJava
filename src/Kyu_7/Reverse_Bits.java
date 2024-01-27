package Kyu_7;

public class Reverse_Bits {
    public static void main (String[] args) {

        int n = 417;
        int quotient = 1;
        String remainder = "";

        int converted = 0;

        while (quotient != 0) {

            if (n / 2 < 1) {
                quotient = 0;
            }

            if ((n % 2) == 1) {
                remainder = remainder + "1";
                n = n / 2;
            }
            else {
                remainder = remainder + "0";
                n = n / 2;
            }
        }

        for (int j = 0; j < remainder.length(); j++) {
            int bin = Character.getNumericValue(remainder.charAt(j));
            int number = (int) (Math.pow(2, (remainder.length() - (j + 1))) * bin);
            converted = converted + number;
        } // Convert an incomplete Binary to a Decimal

        String reversed = "";

        for (int i = 0; i < remainder.length(); i++) {
            reversed = remainder.charAt(i) + reversed;
        } // Reverse a String. Needed only if we wanted to do Decimal -> Binary

        System.out.println(remainder + " is the incomplete binary");
        System.out.println(converted + " is the converted");
        System.out.println(reversed + " is reversed (decimal to binary)");
    }
}
