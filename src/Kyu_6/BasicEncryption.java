package Kyu_6;

public class BasicEncryption {
    public static void main(String[] args) {

        String text = "zu"; // :5
        int rule = 448;

        String result = "";

        for (int i = 0; i < text.length(); i ++) {
            char character = text.toCharArray()[i];
            int numberASCII = text.getBytes()[i];

            numberASCII = numberASCII + rule;

            numberASCII = numberASCII > 255 ? numberASCII = ((numberASCII - 256) & 0xFF) : numberASCII;

            char convertedCharacter = (char) numberASCII;
            result = result + convertedCharacter;
        }
        System.out.println("My result is " + result);
    }
}
