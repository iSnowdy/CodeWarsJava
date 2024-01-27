package Kyu_8;

import java.util.Arrays;

public class Love_Kata {
    public static void main (String[] args) {

        int nb_petals = 70;
        String result = "";

        String[] petals = {"", "I love you", "a little", "a lot", "passionately", "madly", "not at all"};

        if (nb_petals > 6) {
            while (nb_petals > 6) {
                nb_petals = nb_petals - 6;
            }
            result = petals[nb_petals];

        }
        else {
            result = petals[nb_petals];
        }

        System.out.println(result);
        System.out.println(nb_petals%70);

        /*

        public class Sid {
           public static String howMuchILoveYou(int nb_petals) {

                String[] arr ={"not at all", "I love you",  "a little", "a lot", "passionately", "madly"};

                return arr[nb_petals%6];
            }
        }

         */

    }
}
