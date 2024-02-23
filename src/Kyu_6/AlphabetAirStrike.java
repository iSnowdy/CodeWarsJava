package Kyu_6;
import java.util.*;
import java.util.regex.*;


public class AlphabetAirStrike {
    public static String alphabetWar(String fight){



        String left = "wpbs";
        String right = "mqdz";

        Map<Character, Integer> leftSidePowers = new HashMap<>();
        Map<Character, Integer> rightSidePowers = new HashMap<>();
        int score = 0;

        for (int i = 0; i < left.length(); i ++) {
            leftSidePowers.put(left.charAt(i), left.length() - i);
        }

        for (int j = 0; j < right.length(); j ++) {
            rightSidePowers.put(right.charAt(j), right.length() - j);
        }

        char[] charArray = fight.toCharArray();

        boolean doFight = false;

        for (char c : charArray) {
            for (int i = 0; i < left.length(); i ++) {
                if (leftSidePowers.containsKey(c) || rightSidePowers.containsKey(c))
                    doFight = true;
            }
        }

        if (doFight) {
            for (int k = 0; k < charArray.length; k ++) {
                if (charArray[k] == '*') {
                    if (k != 0) {
                        charArray[k - 1] = '_'; // Kill the adjacent left letter
                        charArray[k + 1] = '_'; // Kill the adjacent right letter
                    }
                    else if (k == 0) {
                        charArray[k + 1] = '_';
                    }
                    else if (k == charArray.length + 1) {
                    }
                }
                if (charArray[k] == '*' && charArray[k + 1] == '*' && k > charArray.length) {
                    charArray[k - 1] = '_';
                    charArray[k + 1] = '_';
                }
            }
        }

        System.out.println("My result is: " + Arrays.toString(charArray));

        // Adding score

        for (char c : charArray) {
            if (leftSidePowers.containsKey(c)) {
                score += leftSidePowers.get(c);
            }
            else if (rightSidePowers.containsKey(c)) {
                score -= rightSidePowers.get(c);
            }
        }

        System.out.println(score);
        return score > 0 ? "Left side wins!" : score < 0 ? "Right side wins!" : "Let's fight again!";
    }

    public static void main (String[] args) {

        String fight = "*rtgj**bw*gd*w"; // _*__*__*_s y s_**_**_s *_t__

        alphabetWar(fight);

        /*
        // Handle strings with only '*' characters
        if (charArray.length == 0 || fight.replaceAll("\\*", "").isEmpty()) {
            return "Let's fight again!";
        }

        // Handle strings starting with '*' and ending with '*'
        if (charArray.length >= 2 && charArray[0] == '*' && charArray[charArray.length - 1] == '*') {
            return "Let's fight again!";
        }
         */

    }

}
