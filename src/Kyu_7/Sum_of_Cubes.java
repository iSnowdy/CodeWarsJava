package Kyu_7;

public class Sum_of_Cubes {
    public static void main (String[] args) {

        long n = 2;

        long sum = 0;

        for (long i = 0; i <= n; i++) {
            sum = ((long) sum + ((long)Math.pow(i, 3)));
        }

        System.out.println(sum);
    }
}
