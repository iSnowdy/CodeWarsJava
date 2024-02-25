package Kyu_6;
import java.util.ArrayList;
import java.util.List;

public class ArrayCombinationFor {
    public static int solve(final List<List<Integer>> data) {

        // Code not mine

        ArrayList numbers = new ArrayList<>();
        int output = 1;
        for (List i : data) {
            numbers.clear();
            for (int j = 0; j < i.size(); j++) {
                if (!(numbers.contains(i.get(j)))) {
                    numbers.add(i.get(j));
                }
            }
            output *= numbers.size();
        }
        return output;
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
