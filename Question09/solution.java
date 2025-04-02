// 9. Find Minimum in a Rotated Sorted Array
// Problem Statement
// Given a rotated sorted array, find the minimum element.

// Example
// Input: [4, 5, 6, 7, 0, 1, 2]
// Output: 0

// Input: [3, 4, 5, 1, 2]
// Output: 1
public class solution {
    public static int findMin(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return arr[left];
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println("Minimum Element: " + findMin(arr));
    }
}
