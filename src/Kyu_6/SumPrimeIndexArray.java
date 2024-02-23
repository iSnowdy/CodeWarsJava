package Kyu_6;
import java.util.*;

public class SumPrimeIndexArray {
    public static int solve(int[] arr) {

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                counter += arr[i];
            }
        }
        return counter;
    }

    // Check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // sqrt as a checker
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        solve(array);
    }
}
