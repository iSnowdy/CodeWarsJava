package Kyu_6;

public class FindOdd {
    public static int findIt(int[] a) {

        int result = 0;
        for (int num : a) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {

        int[] a = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};

        findIt(a);

    }
}