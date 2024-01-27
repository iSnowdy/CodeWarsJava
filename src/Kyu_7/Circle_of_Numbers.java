package Kyu_7;

public class Circle_of_Numbers {
    public static void main (String[] args) {

        int n = 10;
        int firstNumber = 2;

        int myNumber;

        myNumber = (n/2) + firstNumber;

        if (myNumber > n) {
            myNumber = Math.abs((n/2) - firstNumber);
        }
        else if (myNumber == n) {
            myNumber = 0;
        }

        System.out.println(myNumber);

      /*

      return (firstNumber + n / 2) % n; Cleaner solution

      */
    }
}
