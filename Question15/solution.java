// 15. Product of Array Except Itself
// Problem Statement
// Find an array where output[i] = product of all elements except arr[i].

// Example
// Input: [1, 2, 3, 4]
// Output: [24, 12, 8, 6]

import java.util.Arrays;

public class solution {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println("Product Array: " + Arrays.toString(productExceptSelf(arr)));
    }
}