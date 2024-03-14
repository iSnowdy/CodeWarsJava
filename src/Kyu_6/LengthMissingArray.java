package Kyu_6;

public class LengthMissingArray {
    public static int getLengthOfMissingArray(int[][] arrayOfArrays) {
        int lengthArray = 0;
        int[] data = new int[arrayOfArrays.length];
        for (int i = 0; i < arrayOfArrays.length; i ++) {
            for (int j = 0; j < arrayOfArrays.length; j ++) {
                data[j] = arrayOfArrays[j].length;
            }
        }

        for (int i = 0; i < data.length - 1; i ++) {
            for (int j = 0; j < data.length - i - 1; j ++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }
        }

        for (int number : data) System.out.println(number);

        for (int i = 0; i < data.length; i ++) {
            if ((data[i + 1] - data[i]) != 1) {
                lengthArray = (data[i + 1] - data[i]);
                break;
            }
        }
        System.out.println(lengthArray);
        return lengthArray;
    }

    public static void main (String[] args) {
        int[][] array1 = {
                {1, 2},
                {4, 5, 1, 1},
                {1},
                {5, 6, 7, 8, 9}
        };
        int[][] array2 = {
                {5, 2, 9},
                {4, 5, 1, 1},
                {1},
                {5, 6, 7, 8, 9}
        };
        getLengthOfMissingArray(array1);
        System.out.println("hey");
        getLengthOfMissingArray(array2);
    }
}
