package com.codewars.kyu7.bingoornot.main;

import java.util.Arrays;

public class BingoOrNot {
    private static final String WIN = "WIN";
    private static final String LOSE = "LOSE";

    //BINGO
    public static String bingo(int[] numberArray) {
        long temp = Arrays.stream(numberArray).filter(i -> i == 2 || i == 7 || i == 9 || i == 14 || i == 15).distinct().count();
        if (temp == 5) {
            return WIN;
        }
        return LOSE;
    }
}
