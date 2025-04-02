// 17. Divide Array into Equal Pairs
// Problem Statement
// Check if an array can be divided into pairs where elements in each pair are equal.

// Example
// Input: [3, 3, 2, 2, 4, 4]
// Output: true

// Input: [1, 2, 3, 4]
// Output: false

import java.util.HashMap;

public class solution {
   public static boolean canDivideIntoPairs(int[] arr) {
        if (arr.length % 2 != 0) return false;
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        for (int count : countMap.values()) if (count % 2 != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 4, 4};
        System.out.println("Can be divided into pairs: " + canDivideIntoPairs(arr));
    }
}