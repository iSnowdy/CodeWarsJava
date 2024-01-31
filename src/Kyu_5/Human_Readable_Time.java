package Kyu_5;

public class Human_Readable_Time {
    public static void main (String[] args) {

        int seconds = 3600;

        int hours = seconds / 3600;
        int leftoverSeconds = seconds % 3600;
        int minutes = leftoverSeconds / 60;
        int realSeconds = leftoverSeconds % 60;

        String result = "";

        result = String.format("%02d:%02d:%02d", hours, minutes, realSeconds);

        // The 'd' stands for decimals. That way we will always get at least 2 digits. If we have only one,
        // it will add a zero to it.

        System.out.println(result);
    }
}
