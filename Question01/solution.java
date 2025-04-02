// 1. Find Largest Element in an Array

// Problem Statement

// Given an array of integers, find the largest element in the array.

// Example

// Input: [10, 5, 20, 8, 15]Output: 20

// Input: [1, 2, 3, 4, 5]Output: 5


public class solution {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        System.out.println("Largest Element: " + findLargest(arr));
    }
}