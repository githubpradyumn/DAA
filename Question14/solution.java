// 14. Find Majority Element
// Problem Statement
// Find the element that appears more than n/2 times in an array.

// Example
// Input: [3, 3, 4, 2, 3, 3, 3]
// Output: 3


import java.util.Arrays;

public class solution {
    public static int findMajorityElement(int[] arr) {
        int count = 0, candidate = -1;
        for (int num : arr) {
            if (count == 0) candidate = num;
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 3, 3, 3};
        System.out.println("Majority Element: " + findMajorityElement(arr));
    }
}