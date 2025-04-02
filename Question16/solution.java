// 16. Merge Two Sorted Arrays
// Problem Statement
// Given two sorted arrays, merge them into one sorted array.

// Example
// Input: [1, 3, 5], [2, 4, 6]
// Output: [1, 2, 3, 4, 5, 6]

import java.util.Arrays;

public class solution {
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            result[k++] = (arr1[i] < arr2[j]) ? arr1[i++] : arr2[j++];
        }
        while (i < arr1.length) result[k++] = arr1[i++];
        while (j < arr2.length) result[k++] = arr2[j++];
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};
        System.out.println("Merged Array: " + Arrays.toString(merge(arr1, arr2)));
    }
}