package Kyu_8;

public class Double_Char {
    public static void main (String[] args) {

        String s = "String";
        String newString = ""; // Initialize variable so we can use it later on (inside the iteration)
        String letter;

        for (int i = 0; i < s.length(); i++) {

            letter = String.valueOf(s.charAt(i)); // This way we get the String value (letters) of the character in position i
            newString = newString + letter + letter;
        }

        System.out.println(newString);

    }
}
