package Kyu_8;

public class repeatIt {
    public static void main (String[] args) {

        final String toRepeat = "*";
        final int n = 3;

        String result = "";

        String dataType = String.valueOf(toRepeat.getClass());
        System.out.println(dataType.length());

        if (dataType.length() == 22) {
            for (int i = 0; i < n; i++) {
                result = result + toRepeat;

            }
        }
        else {
            result = "Not a string";
        }

        System.out.println(result);

        /*

        class RepeatIt {
            static String repeatString(Object toRepeat, int n) {
                return toRepeat instanceof String ? ((String) toRepeat).repeat(n) : "Not a string";
            }
        }

         */


    }
}
