package com.codewars.kyu4.sudokusolutionvalidator.main;

public class MatrixDecompose {
    // method decompose a 9*9 matrix to 3*3 matrices
    public static int[][][] decompose(int[][] matrix) {
        int[][][] result = new int[9][3][3];

        for (int i = 0; i < 9; ) {
            for (int j = 0; j < 9; j += 3) {

                for (int k = 0; k < 9; k += 3) {
                    for (int l = j; l < j + 3; l++) {
                        for (int m = k; m < k + 3; m++) {
                            result[i][l % 3][m % 3] = (matrix[l][m]);
                        }
                    }
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {


        int[][] matrix = {
                {1, 2, 3, 10, 11, 12, 19, 20, 21},
                {4, 5, 6, 13, 14, 15, 22, 23, 24},
                {7, 8, 9, 16, 17, 18, 25, 26, 27},
                {28, 29, 30, 37, 38, 39, 46, 47, 48},
                {31, 32, 33, 40, 41, 42, 49, 50, 51},
                {34, 35, 36, 43, 44, 45, 52, 53, 54},
                {55, 56, 57, 64, 65, 66, 73, 74, 75},
                {58, 59, 60, 67, 68, 69, 76, 77, 78},
                {61, 62, 63, 70, 71, 72, 79, 80, 81}
        };
        int[][][] test = decompose(matrix);
        for (int[][] grid : test) {
            for (int[] gridLine : grid) {
                for (int i = 0; i < 3; i++) {
                    System.out.print(gridLine[i] + " ");
                }
                System.out.println();
            }
            System.out.println("========");
        }

    }

}

