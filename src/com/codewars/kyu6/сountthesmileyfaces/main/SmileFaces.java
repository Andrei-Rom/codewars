package com.codewars.kyu6.сountthesmileyfaces.main;

import java.util.List;

public class SmileFaces {
    private static final String REGEX_SMILE_FACE = "[:;]([-~])?[)D]";

    public static int countSmileys(List<String> arr) {
        int count = 0;
        for (String string : arr) {
            if (string.matches(REGEX_SMILE_FACE)) {
                count++;
            }
        }
        return count;
    }
}