package Kyu_7;

public class Jumping_Number {
    public static String JumpingNumber(int number) {

        String numberString = String.valueOf(number);

        if (numberString.length() <= 1) {
            return "Jumping!!"; // All single-digits are jumpers
        }

        for (int i = 0; i < numberString.length() - 1; i++) {
            int first = numberString.charAt(i);
            int second = numberString.charAt(i + 1);

            if (Math.abs(first - second) != 1) {
                return "Not!!";
            }
        }

        return "Jumping!!";
    }
    public static void main(String[] args) {
        int number = 79;
        String result = JumpingNumber(number);

        System.out.println(result);

    }
}