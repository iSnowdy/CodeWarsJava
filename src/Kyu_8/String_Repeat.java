package Kyu_8;

public class String_Repeat {
    public static void main (String[] args) {

        String string = "Hello";
        int repeat = 3;

        int i = 0;
        String s = ""; // Need to initialize the variable if you're using it inside a loop etc

        while (i < repeat) {
            s = s + string;
            i ++;
        }

        System.out.println(s);
    }
}
