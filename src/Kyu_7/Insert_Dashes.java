package Kyu_7;

public class Insert_Dashes {
    public static void main(String[] args) {

        int num = 454793;

        String numS = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numS.length(); i++) {
            char firstP = numS.charAt(i);

            result.append(firstP);

            if (i < numS.length() - 1) {
                char secondP = numS.charAt(i + 1);

                if (Character.getNumericValue(firstP) % 2 != 0 && Character.getNumericValue(secondP) % 2 != 0) {
                    result.append('-');
                }
            }
        }

        System.out.print(result.toString());

        // return result.toString();

    }
}