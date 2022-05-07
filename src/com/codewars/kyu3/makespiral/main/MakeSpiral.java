package com.codewars.kyu3.makespiral.main;

public class MakeSpiral {

    public static int[][] spiralize(int size) {
        int[][] matrix = new int[size][size];
        int colStart = 0, rowStart = 0;
        int colEnd = size - 1, rowEnd = size - 1;

        while (rowStart <= rowEnd) {
            for (int j = colStart; j <= colEnd; j++) matrix[rowStart][j] = 1;
            for (int i = rowStart; i <= rowEnd; i++) matrix[i][colEnd] = 1;

            if (colStart != 0) colStart += 1;
            if (rowEnd - 1 == rowStart) break;

            for (int j = colEnd - 1; j >= colStart; j--) matrix[rowEnd][j] = 1;
            for (int i = rowEnd - 1; i > rowStart + 1; i--) matrix[i][colStart] = 1;

            rowStart += 2;
            colEnd -= 2;
            rowEnd -= 2;
            colStart += 1;
        }
        return matrix;
    }
}