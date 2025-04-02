// 12. Rotate a Sorted Array k Times
// Problem Statement
// Given a sorted array, rotate it k times to the right.

// Example
// Input: [1, 2, 3, 4, 5], k = 2
// Output: [4, 5, 1, 2, 3]

// Input: [10, 20, 30, 40, 50], k = 3
// Output: [30, 40, 50, 10, 20]

import java.util.Arrays;

public class solution {
    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}