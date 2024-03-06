package Kyu_7;

public class LeapYears {
    public static boolean isLeapYear (int year) {
        if (year % 4 == 0 & year % 100 != 0) return true;
        else if (year % 400 == 0) return true;

        return false;
    }

    public static void main (String[] args) {
        int year = 2020;
        System.out.println(isLeapYear(year));
    }
}
