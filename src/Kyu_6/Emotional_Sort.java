package Kyu_6;

import java.util.Arrays;

public class Emotional_Sort {
    public static void main(String[] args) {

        String[] emotions = {":D", ":|", ":)", ":(", ":D"};
        boolean order = true;

        for (int i = 0; i < emotions.length; i ++) { // Bubble sorth method with Strings
            for (int j = 0; j < emotions.length - i - 1; j ++) {
                if (bubble(emotions[j], emotions[j + 1], order)) { // condition: true then it is swapped
                    String temp = emotions[j];
                    emotions[j] = emotions[j + 1];
                    emotions[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(emotions));

    }

    public static int emotionValue(String emotion) {

        switch (emotion) {
            case ":D":
                return 0;
            case ":)":
                return 1;
            case ":|":
                return 2;
            case ":(":
                return 3;
            case "T_T":
                return 4;
            default:
                return -1;
        }
    }

    public static boolean bubble(String emotionA, String emotionB, boolean order) {
        if (order) { // true = descending order = from happy to sad = sad last
            return emotionValue(emotionA) > emotionValue(emotionB);
            // true if the emotion value is higher. And since if order = true it means descending, we want
            // first the happy faces
        }
        else {
            return emotionValue(emotionA) < emotionValue(emotionB);
        }
    }
}
