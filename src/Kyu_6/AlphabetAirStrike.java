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

        System.out.println(fight + "result");

        for (char c : fight.toCharArray()) {
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

        String fight = "zd*qm*wp*bs";

        alphabetWar(fight);

    }

}
