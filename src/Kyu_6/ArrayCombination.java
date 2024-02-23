package Kyu_6;
import java.util.List;
import java.util.*;

public class ArrayCombination {
    public static void main(String[] args) {

        Integer[][] arrayNumber =
                {
                {1, 2},
                {4, 4},
                {5, 6, 6}
                };

        int[][] arrayResult = new int[4][3];

        for (int i = 0; i < arrayNumber.length; i++) {
            for (int j = 0; j < arrayNumber[i].length; j++) {
                if (arrayNumber[i][j] == arrayResult[i][j]) {
                    break;
                }
                else {
                    arrayResult[i][j] = arrayNumber[i][j];
                }
            }
        }





        System.out.println(Arrays.deepToString(arrayNumber) + " arrayNumber");
        System.out.println(Arrays.deepToString(arrayResult) + " arrayNumber");
        System.out.println(arrayNumber.length + " Length");

    }
}