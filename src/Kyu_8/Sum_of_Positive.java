package Kyu_8;

public class Sum_of_Positive {
    public static void main (String[] args) {

        int[] arr = {1, -4, 7, 12};

        int sum = 0;

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
            }
        }

        if (sum < 0) {
            sum = 0;
        }

        System.out.println(sum);

    }
}
