package Kyu_6;
import java.util.*;

public class ArrayCombinationHashSet {
    public static int solve(final List<List<Integer>> data) {

        // Pseudocode + HashSet

        int totalCombinations = 1;

        for (List<Integer> array : data) {
            Set<Integer> combinations = new HashSet<>();
            for (int number : array) {
                System.out.println("Number is: " + number);
                System.out.println("Of the array: " + array);
                combinations.add(number);
            }
            System.out.println("And combinations so far are: " + combinations);
            totalCombinations *= combinations.size();
        }

        return totalCombinations;
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
