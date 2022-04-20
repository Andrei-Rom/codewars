package com.codewars.kyu4.sudokusolutionvalidator.main;

public class MatrixRotate {
    private static int[][] rotateMatrix(int[][] matrix) {
        int[][] rotate = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotate[i][j] = matrix[matrix[i].length - j - 1][i];
            }
        }
        return rotate;
    }
}