package Kyu_7;

public class Disemvowel_Trolls {
    public static void main (String[] args) {

        String str = "This website is for losers LOL!";
        String result;

        result =  str.replaceAll("[AEIOUaeiou]", ""); // of x to y (vowels to empty)

        System.out.println(result);

    }
}
