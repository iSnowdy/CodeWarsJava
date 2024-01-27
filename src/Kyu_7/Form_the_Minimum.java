package Kyu_7;

import java.util.Arrays;

public class Form_the_Minimum {
    public static void main(String[] args) {

        int[] values = {6, 7, 8, 7, 6, 6};
        int k = 0;
        int[] result = new int[values.length];


        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < values.length; i++) {
            if (i == 0 || values[i] != result[k - 1]) {
                result[k] = values[i];
                k++;
            }
        }

        result = Arrays.copyOf(result, k);

        StringBuilder resultString = new StringBuilder();

        for (int i : result) {
            resultString.append(i);
        }

        int finalResult = Integer.parseInt(String.valueOf(resultString));
        System.out.println(finalResult);

    }
}
