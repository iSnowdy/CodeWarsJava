package Kyu_7;
import java.util.*;


public class Count_Char {
    public static void main(String[] args) {

        String text = "abracadabra";

        Map<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            letterCount.put(ch, letterCount.getOrDefault(ch, 0) + 1);
        }

        for (Character i : letterCount.keySet()) {
            System.out.println("key: " + i + " value: " + letterCount.get(i));
        }

    }
}
