package Kyu_7;

import java.util.Arrays;

public class FizzBuzz {
    public static int[] solution(int number) {
        int[] result = new int[3];
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 1; i < number; i ++) {
            if (i % 3 == 0 && i % 5 != 0 ) {
                sumA ++;
            } else if (i % 5 == 0 && i % 3 != 0 ) {
                sumB ++;
            } else if (i % 3 == 0 && i % 5 == 0 ) {
                sumC ++;
            }
        }
        result[0] = sumA;
        result[1] = sumB;
        result[2] = sumC;

        System.out.println(Arrays.toString(result));

        return result;
    }

    public static void main (String[] args) {
        int data1 = 20;
        int data2 = 2;
        int data3 = 141;

        solution(data1);
        solution(data2);
        solution(data3);
    }
}
