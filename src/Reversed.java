import java.util.Arrays;

public class Reversed {
    public static void main(String[] args) {

        int n = 35231;

        String originalInt = String.valueOf(n);

        int[] reversed = new int[originalInt.length()];

        for (int i = 0; i < originalInt.length(); i++) {
            int number = Character.getNumericValue(originalInt.charAt(i));
            reversed[originalInt.length() - 1 - i] = number;
        }

        // 5 - 1 - 0 = position 4 ... 5 - 1 - 1 = position 3 ... etc

        System.out.print(Arrays.toString(reversed));

    }
}