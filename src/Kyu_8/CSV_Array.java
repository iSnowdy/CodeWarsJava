package Kyu_8;

public class CSV_Array {
    public static void main (String[] args) {

        int[][] array = {
                {0, 1, 2, 3, 4},
                {10,11,12,13,14},
                {20,21,22,23,24},
                {30,31,32,33,34}
        };

        StringBuilder csv = new StringBuilder(); // A StringBuilder is different from a String in Java in the sense that it can be modified

        for (int i = 0; i < array.length; i++) { // We have to iterate on a two dimensional array. So we need 2 indexes (i are rows and j are columns)
            for (int j = 0; j < array[i].length; j++) {
                csv.append(array[i][j]); // We add the element of that position to the new string

                if (j < array[i].length - 1) { // Example: length = 5 - 1 = 4. If j = 3, its still not the last element. If j = 4, it is, so it wouldn't add the ","
                    csv.append(","); // If it is not the last element, we add a ","
                }
            }
            if (i < array.length - 1) { // Example: in a length 3 double dimensional array, 3 - 1 = 2. If i = 2 is the last element (0, 1, 2) so it wouldn't add that "\n"
                csv.append("\n"); // Here if i position is not the last row, we add a break line
            }
        }

        System.out.println(csv);

    }
}
