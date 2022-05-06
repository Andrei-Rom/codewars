package com.codewars.kyu5.countipaddresses.main;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {

        long[] from = Arrays.stream(start.split("\\.")).mapToLong(Long::parseLong).toArray();
        long[] to = Arrays.stream(end.split("\\.")).mapToLong(Long::parseLong).toArray();

        return IntStream.of(0, 1, 2, 3).mapToLong(i -> (to[i] - from[i]) << 8 * (3 - i)).sum();
    }
}

