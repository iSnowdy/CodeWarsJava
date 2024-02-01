package org.example.Kyu_6;
import java.util.*;


public class SmileyFaces {
    public static int countSmileys(List<String> arr) {



        String[] eyes = {":", ";"};
        String[] nose = {"-", "~", ""};
        String[] mouth = {")", "D"};

        int result = 0;

        for (int i = 0; i < arr.size(); i++) {
            String now = arr.get(i);
            System.out.println(now);
            if (arr.get(i).contains(eyes[0]) || arr.get(i).contains(eyes[1])) {
                if (arr.get(i).contains(nose[0]) || arr.get(i).contains(nose[1]) || arr.get(i).contains(nose[2])) {
                    if (arr.get(i).charAt(arr.get(i).length() - 1) == ')' || arr.get(i).charAt(arr.get(i).length() - 1) == 'D') {
                        result++;
                    }
                }
            }
        }

        System.out.println("My result is " + result);

        return result;
    }
}
