package com.codewars.kyu6.splitstrings.main;

public class SplitStrings {
    public static String[] splitStrings(String s) {
        if (s.length() % 2 != 0) {
            s = s + "_";
        }
        char[] string = s.toCharArray();
        String[] result = new String[s.length() / 2];

        for (int i = 0; i < result.length; i++) {
            result[i] = String.valueOf(string[i * 2]) + string[i * 2 + 1];
        }

        return result;
    }
}
