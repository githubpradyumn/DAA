// 7. Move All Zeros to the End
// Problem Statement
// Given an integer array, move all 0s to the end while maintaining the relative order of non-zero elements.

// Example
// Input: [0, 1, 0, 3, 12]
// Output: [1, 3, 12, 0, 0]

// Input: [0, 0, 1]
// Output: [1, 0, 0]

import java.util.Arrays;

public class solution {
    public static void moveZerosToEnd(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZerosToEnd(arr);
        System.out.println("After Moving Zeros: " + Arrays.toString(arr));
    }
}
