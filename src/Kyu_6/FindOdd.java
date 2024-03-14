package Kyu_6;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        for (int mapKey : countMap.keySet()) {
            if (countMap.get(mapKey) % 2 != 0) return mapKey;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] a = new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};

        findIt(a);

    }
}