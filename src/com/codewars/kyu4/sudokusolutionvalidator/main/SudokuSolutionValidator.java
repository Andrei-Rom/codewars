package com.codewars.kyu4.sudokusolutionvalidator.main;

import java.util.Arrays;

public class SudokuSolutionValidator {
    private static final int[] GRID = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static boolean check(int[][] sudoku) {
        if (isCorrectSudokuDigits(sudoku)) {
            if (isCorrectSudokuLines(sudoku)) {
                int[][] columns = rotateMatrix(sudoku);
                if (isCorrectSudokuLines(columns)) {
                    return isCorrectSudokuGrid(sudoku);
                }
            }
        }
        return false;
    }

    private static boolean isCorrectSudokuDigits(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            int[] row = sudoku[i];
            if (Arrays.stream(row).filter(e -> (e > 0)).filter(e -> (e < 10)).count() != 9) return false;
        }

        return true;
    }

    private static boolean isCorrectSudokuLines(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            int[] row = sudoku[i];
            if (Arrays.stream(row).distinct().count() != 9) return false;
        }
        return true;
    }

    private static boolean isCorrectSudokuGrid(int[][] sudoku) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 9; ) {
            for (int j = 0; j < 9; ) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        int t = k;
                        int f = l;
                        builder.append(sudoku[t][f]);
                    }
                }
                builder.append(" ");
                j += 3;
            }
            i += 3;
        }
        if (Arrays.stream(builder.toString().split(" ")).distinct().count() != 9) return false;
        for (String grid : builder.toString().split(" ")) {
            char[] chars = grid.toCharArray();
            int[] ints = new int[9];
            for (int i = 0; i < 9; i++) {
                ints[i] = chars[i] - '0';
            }
            Arrays.sort(ints);
            for (int i = 0; i < 9; i++) {
                if (ints[i] != GRID[i]) return false;
            }
        }
        return true;
    }

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
