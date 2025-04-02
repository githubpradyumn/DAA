// 5. Insertion Sort

// Problem Statement

// Implement Insertion Sort to sort an array in ascending order.

// Example

// Input: [5, 3, 8, 6, 2]Output: [2, 3, 5, 6, 8]

// Input: [4, 3, 2, 1]Output: [1, 2, 3, 4]

import java.util.Arrays;

public class solution {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        insertionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
