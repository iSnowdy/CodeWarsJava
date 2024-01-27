package Kyu_7;

public class Split_in_Parts {
    public static void main (String[] args) {

        String s = "supercalifragilisticexpialidocious";
        int partLength = 3;

        int bigcounter = 0;
        int counter = 0;

        String spaced = "";

        while (s.length() > bigcounter) {
            spaced = spaced + s.charAt(bigcounter);
            bigcounter ++;
            counter ++;
            if (counter == partLength & bigcounter != s.length()) { // & part is so that we don't add spaces when the String has ended
                spaced = spaced + " ";
                counter = 0;
            }
        }

        System.out.println(spaced);

    }
}
