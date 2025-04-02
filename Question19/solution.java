// 19. Rotate Image by 90 Degrees (Clockwise)
// Problem Statement
// You are given an n x n 2D matrix representing an image. Rotate the matrix 90 degrees clockwise in-place.

// Example
// Input:


// 1  2  3  
// 4  5  6  
// 7  8  9 

// Output:


// 7  4  1  
// 8  5  2  
// 9  6  3  

import java.util.Arrays;

public class solution {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);
        System.out.println("Rotated Matrix: " + Arrays.deepToString(matrix));
    }
}