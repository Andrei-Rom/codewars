package com.codewars.kyu7.descendingorder.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(123456789 )); //987654321
    }

    public static int sortDesc(final int num) {

        return Integer.parseInt(Arrays.stream(Integer.toString(num).split(""))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));

    }
}
