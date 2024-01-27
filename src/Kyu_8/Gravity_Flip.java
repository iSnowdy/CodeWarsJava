package Kyu_8;

import java.util.Arrays;

public class Gravity_Flip {

    public static void main(String[] args) {
        // Example usage
        int[] initialConfiguration = {4, 2, 8, 3};
        char direction = 'L'; // Left = reversed; Right = in order

        int[] result = switchGravity(initialConfiguration, direction);

        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] switchGravity(int[] configuration, char direction) { // Sorting function

        if (direction == 'R') {
            Arrays.sort(configuration);
        } else if (direction == 'L') {
            Arrays.sort(configuration);
            reverseArray(configuration);
        }

        return configuration;
    }

    private static void reverseArray(int[] arr) { // Reverse the array

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move indices towards the center
            left++;
            right--;
        }
    }
}