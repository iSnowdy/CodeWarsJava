package Kyu_7;

public class Snail_Crawls_Up {

    public static int daysToReachTop(int columnHeight, int dayClimb, int nightSlide) {
        if (dayClimb >= columnHeight) {
            return 1;
        }

        int currentHeight = 0;
        int days = 0;

        while (currentHeight < columnHeight) {
            days++;
            currentHeight += dayClimb;

            if (currentHeight >= columnHeight) {
                return days;
            }

            currentHeight -= nightSlide;
        }

        return days;
    }

    public static void main(String[] args) {
        int columnHeight = 10; // ejemplo: altura de la columna
        int dayClimb = 3;     // ejemplo: subida diaria
        int nightSlide = 2;   // ejemplo: deslizamiento nocturno

        int result = daysToReachTop(columnHeight, dayClimb, nightSlide);
        System.out.println("La caracola alcanzará la cima en " + result + " días.");
    }
}