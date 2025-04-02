// 18. Transpose a Matrix
// Problem Statement
// Transpose a given n x n matrix.

// Example
// Input:


// 1 2 3  
// 4 5 6  
// 7 8 9  

// Output:

// 1 4 7  
// 2 5 8  
// 3 6 9  

import java.util.Arrays;

public class solution {
   public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Transposed Matrix: " + Arrays.deepToString(transpose(matrix)));
    }
}