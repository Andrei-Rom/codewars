package com.codewars.kyu4.sudokusolutionvalidator.main;

import java.util.Arrays;

public class SudokuSolutionValidator {
    private static final int[] GRID = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static boolean check(int[][] sudoku) {
        if (isCorrectSudokuLinesDigits(sudoku)) {
            return isCorrectSudokuGrid(sudoku);
        }
        return false;
    }

    private static boolean isCorrectSudokuLinesDigits(int[][] sudoku) {
        for (int[] row : sudoku) {
            if (Arrays.stream(row).filter(e -> (e > 0)).filter(e -> (e < 10)).distinct().count() != 9) return false;
        }
        return true;
    }

    private static boolean isCorrectSudokuGrid(int[][] sudoku) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        builder.append(sudoku[k][l]);
                    }
                }
                builder.append(" ");
            }
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
}