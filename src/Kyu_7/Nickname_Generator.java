package Kyu_7;

public class Nickname_Generator {
    public static void main (String[] args) {

        String name = "Greg";
        String vowels = "aeiou";
        String result;

        result = (name.length() < 4) ? "Error: Name too short" : (vowels.contains(String.valueOf(name.charAt(2))) ?
                name.substring(0, 4) : name.substring(0, 3));

        System.out.println(result);

    }
}
