// 10. Find Starting and Ending Position of a Given Target
// Problem Statement
// Given a sorted array and a target value, find the starting and ending position of the target.

// Example
// Input: [5, 7, 7, 8, 8, 10], target = 8
// Output: [3, 4]

// Input: [1, 2, 3, 4, 5], target = 6
// Output: [-1, -1]

import java.util.Arrays;

public class solution {
    public static int[] searchRange(int[] arr, int target) {
        int first = findIndex(arr, target, true);
        int last = findIndex(arr, target, false);
        return new int[]{first, last};
    }

    private static int findIndex(int[] arr, int target, boolean firstOccurrence) {
        int left = 0, right = arr.length - 1, index = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                index = mid;
                if (firstOccurrence) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        System.out.println("Target Range: " + Arrays.toString(searchRange(arr, 8)));
    }
}