package Kyu_6;

public class EncryptThis {
    public static String encryptThis(String text) {

        String result = "";
        String[] textArray;
        textArray = text.split(" ");

        for (String word : textArray) {
            String reversedWord = "";
            int numberASCII = word.getBytes()[0];
            System.out.println(numberASCII);
            for (int i = 1; i < word.length(); i ++) {
                reversedWord = word.charAt(i) + reversedWord;
            }
            result = result + numberASCII + reversedWord + " ";
        }

        System.out.println(result.strip());
        return result.strip();

    }

    public static void main(String[] args) {

        String text = "A wise old owl lived in an oak";
        encryptThis(text);

    }


}
