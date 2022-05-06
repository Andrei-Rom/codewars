package com.codewars.kyu5.weightforweight.main;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

public class WeightSort {

    public static String orderWeight(String strng) {
        String[] strings = strng.trim().split("\s+");
        if (strings.length == 1) {
            return strng;
        }


        Arrays.sort(strings, (s1, s2) -> {
            long wight1 = Long.parseLong(s1);
            long wight2 = Long.parseLong(s2);
            long number = wight1;
            long digit;
            long sum1 = 0;
            while (number > 0) {
                digit = number % 10;
                sum1 = sum1 + digit;
                number = number / 10;
            }
            number = wight2;
            long sum2 = 0;
            while (number > 0) {
                digit = number % 10;
                sum2 = sum2 + digit;
                number = number / 10;
            }

            if (sum1 == sum2) {
                return s1.compareTo(s2);
            }
            return BigInteger.valueOf(sum1).compareTo(BigInteger.valueOf(sum2));
        });

        return String.join(" ", strings);
    }

    public static String orderWeightStream(String strng) {
        String[] strings = strng.split(" ");
        Arrays.sort(strings, (a, b) -> {
            int aWeight = a.chars().map(Character::getNumericValue).sum();
            int bWeight = b.chars().map(Character::getNumericValue).sum();
            return aWeight - bWeight != 0 ? aWeight - bWeight : a.compareTo(b);
        });
        return String.join(" ", strings);
    }
}