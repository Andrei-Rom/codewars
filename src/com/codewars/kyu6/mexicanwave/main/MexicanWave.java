package com.codewars.kyu6.mexicanwave.main;

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {
    public static String[] wave(String str) {
        if (str.isEmpty()) {
            return new String[0];
        }
        List<String> wave = new ArrayList<>();
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (str.charAt(i) == ' ') {
                continue;
            }
            wave.add((str.substring(0, i) + Character.toUpperCase(c) + str.substring(i + 1)));
        }
        return wave.toArray(String[]::new);
    }
}
