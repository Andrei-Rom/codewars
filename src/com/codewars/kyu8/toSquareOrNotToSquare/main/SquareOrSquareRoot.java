package com.codewars.kyu8.toSquareOrNotToSquare.main;

import java.util.stream.IntStream;

public class SquareOrSquareRoot {

    public static int[] squareOrSquareRoot(int[] array) {
        return IntStream.of(array)
                .map(i -> (Math.sqrt(i) % 1 == 0) ? (int) Math.sqrt(i) : (int) Math.pow(i, 2.0))
                .toArray();
    }
}
