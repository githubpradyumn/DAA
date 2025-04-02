// 11. Find Peak Element from an Array
// Problem Statement
// Given an array, find a peak element where nums[i] > nums[i-1] and nums[i] > nums[i+1].

// Example
// Input: [1, 2, 3, 1]
// Output: 3

// Input: [1, 2, 1, 3, 5, 6, 4]
// Output: 6

import java.util.Arrays;

public class solution {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println("Peak Element: " + findPeakElement(arr));
    }
}