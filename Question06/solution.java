// 6. Remove Duplicates from an Array
// Problem Statement
// Given an array of integers, remove duplicate elements and return the unique elements in sorted order.

// Example
// Input: [4, 2, 2, 8, 3, 3, 1]
// Output: [1, 2, 3, 4, 8]

// Input: [5, 5, 5, 5]
// Output: [5]

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class solution {
    public static int[] removeDuplicates(int[] arr) {
        Set<Integer> uniqueSet = new TreeSet<>();
        for (int num : arr) {
            uniqueSet.add(num);
        }
        return uniqueSet.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        int[] result = removeDuplicates(arr);
        System.out.println("Unique Elements: " + Arrays.toString(result));
    }
}
