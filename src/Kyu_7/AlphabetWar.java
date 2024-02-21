package Kyu_7;

import java.util.HashMap;
import java.util.Map;

public class AlphabetWar {
    public static String alphabetWar(String fight) {

        Map<Character, Integer> leftSidePowers = new HashMap<>();

        leftSidePowers.put('w', 4);
        leftSidePowers.put('p', 3);
        leftSidePowers.put('b', 2);
        leftSidePowers.put('s', 1);

        Map<Character, Integer> rightSidePowers = new HashMap<>();

        rightSidePowers.put('m', 4);
        rightSidePowers.put('q', 3);
        rightSidePowers.put('d', 2);
        rightSidePowers.put('z', 1);

        int score = 0;

        for (char c : fight.toCharArray()) {
            if (leftSidePowers.containsKey(c)) {
                score += leftSidePowers.get(c);
            }
            else if (rightSidePowers.containsKey(c)) {
                score -= rightSidePowers.get(c);
            }
        }

        return score > 0 ? "Left side wins!" : score < 0 ? "Right side wins!" : "Let's fight again!";
    }

    public static void main (String[] args) {

        String fight = "zdqmwpbs";

        alphabetWar(fight);

    }
}
