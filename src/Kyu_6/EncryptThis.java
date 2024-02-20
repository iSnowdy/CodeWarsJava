package Kyu_6;

public class EncryptThis {
    public static String encryptThis(String text) {

        if (text.length() == 0) {
            return "";
        }

        StringBuilder reversedWord = new StringBuilder();

        String[] textArray = text.split(" ");

        for (String word : textArray) {
            int numberASCII = word.charAt(0);
            reversedWord.append(numberASCII);

            if (word.length() > 1) { // Len = 1 no encryption needed
                if (word.length() > 2) { // Only 2 chars no needed either (ASCII + char)
                    String building = word.charAt(word.length() - 1) +
                            word.substring(2, word.length() - 1) +
                            word.charAt(1); // Last + from 2 to second last + second
                    reversedWord.append(building);
                } else {
                    reversedWord.append(word.charAt(1));
                }
            }
            reversedWord.append(" ");
        }

        System.out.println(reversedWord);
        return reversedWord.toString().trim();
    }

    public static void main(String[] args) {

        String text = "A wise old owl lived in an oak";
        encryptThis(text);

    }
}
