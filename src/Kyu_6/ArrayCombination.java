package Kyu_6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayCombination {
    public static int solve(final List<List<Integer>> data) {

        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Empty


        for (List<Integer> sublist : data) { // Iterate through each subarray of the main data given
            List<List<Integer>> possibleCombinations = new ArrayList<>(); // New ArrayList to store the possible combinations

            for (Integer num : sublist) {
                // Generate new combinations by adding the current number to existing combinations
                for (List<Integer> comb : result) { // Now we iterate through the new ArrayList
                    List<Integer> newComb = new ArrayList<>(comb);
                    newComb.add(num);

                    if (!possibleCombinations.contains(newComb)) { // Check for dupes
                        possibleCombinations.add(newComb);
                    }
                    // System.out.println(newComb);
                    // System.out.println(possibleCombinations);
                }
            }
            result = possibleCombinations;
        }

        return result.size();
    }

    public static void main(String[] args) {
        // Example usage:
        List<List<Integer>> data = List.of(
                List.of(1, 2),
                List.of(4, 4),
                List.of(5, 6, 6)
        );
        System.out.println(solve(data));
    }
}
