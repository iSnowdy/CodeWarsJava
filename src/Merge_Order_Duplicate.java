import java.util.Arrays;

public class Merge_Order_Duplicate {
    public static void main(String[] args) {

        int[] first = { 2, 4, 8 };
        int[] second = { 2, 4, 6 };

        int[] result = new int[first.length + second.length]; // First of all we initialize the int array
        int i = 0, j = 0, k = 0; // All indexes we will be using

        while (i < first.length || j < second.length) { // With this while we make sure we iterate through the whole array (or operator)
            int next; // We will be using the next values to see if it can be added or not to the int array

            if (i < first.length && (j == second.length || first[i] <= second[j])) { 
            /* 
            
            With this if block we decide if the number should be taken from the first or second array.
            i < first.length checks if there are numbers to still check inside the array
            Then we see if we need to get the number from the first array or not
            Finally first[i] <= second[j] is to check that we are not in the last number. And if the position i of the first array is smaller or equal than the 
            element in the same position (j) of the second array, we choose to add that number from the first array (smaller)
              
            */
                next = first[i++]; // The value is stored and i incremented to check for the next number
            } else {
                next = second[j++];
            }

            if (k == 0 || next != result[k - 1]) {
                // Finally with this if checks if the number is different from the last element added in the result array so we don't get any copies
                // If it's not repeated, then it's added to the result array. Also the k == 0 is there to check for the same, but for the first number (can't be repeated)
                result[k++] = next;
            }
        }

        int[] finalArray = Arrays.copyOf(result, k); // We return a new array that is the copy of result but in the proper size
        System.out.println(Arrays.toString(finalArray));
    }
}
