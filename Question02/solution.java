// 2. Find Second Largest Element in an Array

// Problem Statement

// Given an array of integers, find the second largest element. If no second largest exists, return an appropriate message.

// Example

// Input: [10, 5, 20, 8, 15]Output: 15

// Input: [5, 5, 5, 5]Output: No second largest element
public class solution {
    public static int findSecondLargest(int[] arr) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 15};
        System.out.println("Second Largest: " + findSecondLargest(arr));
    }
}
