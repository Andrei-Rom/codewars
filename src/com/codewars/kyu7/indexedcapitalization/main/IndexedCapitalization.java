package com.codewars.kyu7.indexedcapitalization.main;

import java.util.Arrays;

public class IndexedCapitalization {
    public static String capitalize(String s, int[] ind) {
        char[] chars = s.toCharArray();
        Arrays.stream(ind).filter(i -> i < s.length())
                .forEach(i -> chars[i] = Character.toUpperCase(chars[i]));
        return new String(chars);
    }
}
