package org.example.Kyu_6;
import java.util.*;


public class SmileyFaces {
    public static int countSmileys(List<String> arr) {

        String[] eyes = {":", ";"};
        String[] nose = {"-", "~", ""};
        String[] mouth = {")", "D"};

        int result = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() >= 2 && (arr.get(i).contains(eyes[0]) || arr.get(i).contains(eyes[1]))) {
                if (arr.get(i).length() == 2 || (arr.get(i).length() == 3 && isValidNose(arr.get(i).charAt(1), nose))) {
                    if (arr.get(i).charAt(arr.get(i).length() - 1) == ')' || arr.get(i).charAt(arr.get(i).length() - 1) == 'D') {
                        result++;
                    }
                }
            }
        }

        System.out.println("My result is " + result);

        return result;

    }
    private static boolean isValidNose(char noseChar, String[] nose) {
        String noseString = String.valueOf(noseChar);
        return noseString.equals(nose[0]) || noseString.equals(nose[1]) || noseString.equals(nose[2]);
    }

    /*

    import java.util.*;

    public class SmileFaces {

     static String validSmilyFaces =  ":) ;) :-) :~) ;-) ;~) :D ;D :-D :~D ;~D ;~) ;-D";


      public static int countSmileys(List<String> arr) {
          int counter = 0;

          for (int i =0; i < arr.size(); i++){

            if (validSmilyFaces.contains(arr.get(i))){
                counter++;
            }
          }
          return counter;
      }
    }

     */

}