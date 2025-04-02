// 4. Selection Sort

// Problem Statement

// Implement Selection Sort to sort an array in ascending order.

// Example

// Input: [64, 25, 12, 22, 11]Output: [11, 12, 22, 25, 64]

// Input: [9, 7, 5, 3, 1]Output: [1, 3, 5, 7, 9]

import java.util.Arrays;

public class solution {
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
