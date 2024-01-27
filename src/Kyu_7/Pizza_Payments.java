package Kyu_7;

public class Pizza_Payments {
    public static void main (String[] args) {

        double cost = 30;

        double payed = 0;
        double katePayed = 0;

        double result;


        if (cost < 5) {
            payed = cost;
        }

        if (cost >= 5) {
            katePayed = (double) 1 /3 * cost;
            payed = cost - katePayed;
        }

        if (katePayed > 10) {
            katePayed = 10;
            cost = cost - katePayed;
            payed = cost;

        }

        result = (Math.round(payed * 100.0) / 100.0); // As many 0's as decimals we want. So for 3 decimals, 1000.0

        System.out.println(result);

        /*

        Altenative solution:

        return Math.round((cost < 5 ? cost : cost - Math.min(cost / 3, 10)) * 100.0) / 100.0;

        */
    }
}
