package Kyu_7;

import java.util.Arrays;
import java.util.HashMap;

public class DigitalCypher {
    public static void main(String[] args) {

        String message = "scout";
        int key = 1939;
        String alphabet = "-abcdefghijklmnopqrstuvwxyz";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        // HashMap Alphabet

        for (int i = 1; i < 27; i++) {
            map.put(alphabet.charAt(i), i);
        }

        // for (Character i : map.keySet()) {System.out.println("key: " + i + " value: " + map.get(i));}

        String keyStr = String.valueOf(key);
        int[] digits = new int[keyStr.length()];
        for (int i = 0; i < keyStr.length(); i++) {
            digits[i] = Character.getNumericValue(keyStr.charAt(i));
        }

        System.out.println("Array int" + Arrays.toString(digits));

        int[] encoded = new int[message.length()];
        for (int i = 0; i < message.length(); i++) {
            int letterNum = map.get(message.charAt(i));
            System.out.println(letterNum);
            int keyDigit = digits[i % digits.length]; // Modulo operator to control index
            encoded[i] = letterNum + keyDigit;
        }

        System.out.println(Arrays.toString(encoded));
    }
}