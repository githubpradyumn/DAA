// 8. Search an Element Using Linear and Binary Search
// Problem Statement
// Given a sorted array and a target value, find its index using linear and binary search.

// Example
// Input: [1, 3, 5, 7, 9], target = 5
// Output: Found at index 2

// Input: [2, 4, 6, 8], target = 7
// Output: Not found
public class solution {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        int target = 5;
        System.out.println("Linear Search: Found at index " + linearSearch(arr, target));
        System.out.println("Binary Search: Found at index " + binarySearch(arr, target));
    }
}
