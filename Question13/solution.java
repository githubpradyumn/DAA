// 13. Find Square Root Using Binary Search
// Problem Statement
// Given an integer x, find its square root using binary search (only integer part).

// Example
// Input: x = 16
// Output: 4

// Input: x = 8
// Output: 2

import java.util.Arrays;

public class solution {
    public static int findSqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid <= x / mid) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Square Root: " + findSqrt(8));
    }
}