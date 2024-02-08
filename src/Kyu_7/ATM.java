package Kyu_7;

public class ATM {
    public static void main(String[] args) {

        int n = 770;

        Integer[] bills = {500, 200, 100, 50, 20, 10};
        Integer counter = 0;
        int result = 0;

        if (n > 1500 || n % 10 != 0) {
            result = -1;
            System.out.println(result);
        }
        else {
            for (int i : bills) {
                while (n >= i) {
                    n -= i;
                    counter++;
                }
            }

            result = counter;
            System.out.println(result);
        }
    }

}
