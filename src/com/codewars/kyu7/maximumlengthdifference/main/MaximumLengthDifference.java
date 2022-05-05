package com.codewars.kyu7.maximumlengthdifference.main;

import java.util.Arrays;

public class MaximumLengthDifference {
    public static int maximumLengthDifference(String[] a1, String[] a2) {
        if (a1.length == 0 || a2.length == 0) {
            return -1;
        }

        int a1MaxLength = Arrays.stream(a1).map(String::length).max(Integer::compareTo).get();
        int a1MinLength = Arrays.stream(a1).map(String::length).min(Integer::compareTo).get();

        int a2MaxLength = Arrays.stream(a2).map(String::length).max(Integer::compareTo).get();
        int a2MinLength = Arrays.stream(a2).map(String::length).min(Integer::compareTo).get();

        return Math.max(Math.abs(a1MaxLength - a2MinLength), Math.abs(a2MaxLength - a1MinLength));
    }
}
