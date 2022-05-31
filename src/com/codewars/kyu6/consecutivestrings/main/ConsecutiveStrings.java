package com.codewars.kyu6.consecutivestrings.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConsecutiveStrings {

    public static String longestConsecStream(String[] strarr, int k) {

        return k <= 0 ? "" : IntStream.rangeClosed(0, strarr.length - k)
                .mapToObj(x -> Arrays.stream(strarr, x, x + k)
                        .collect(Collectors.joining()))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }


    public static String longestConsec(String[] strarr, int k) {
        if (k <= 0 || strarr.length < k) return "";

        int[] lens = Stream.of(strarr).mapToInt(String::length).toArray();
        int iBest = -1;
        int best = -1;
        int sum = Arrays.stream(lens, 0, k).sum();
        for (int i = 0; i < lens.length + 1 - k; i++) {
            if (best < sum) {
                iBest = i;
                best = sum;
            }
            if (i + k < lens.length) {
                sum += lens[i + k] - lens[i];
            }
        }
        return Arrays.stream(strarr, iBest, iBest + k)
                .collect(Collectors.joining());
    }
}
