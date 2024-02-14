package Kyu_6;

import java.util.Arrays;

public class Stop_Spinning {
    public static void main(String[] args) {

        String sentence = "Welcome";
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(); // Reset the StringBuilder every instance so we don't get repeats

            if (word.length() >= 5) {
                for (int j = word.length() - 1; j >= 0; j--) {
                    reversedWord.append(word.charAt(j));
                }
                result.append(reversedWord);
            }
            else {
                result.append(word);
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);


    }

}
