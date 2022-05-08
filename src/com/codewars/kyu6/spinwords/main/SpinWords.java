package com.codewars.kyu6.spinwords.main;

import java.util.StringJoiner;

public class SpinWords {
    public String spinWords(String sentence) {
        StringJoiner joiner = new StringJoiner(" ");
        String[] strings = sentence.split(" ");
        for (String string : strings) {
            if (string.length() >= 5) {
                joiner.add(new StringBuilder(string).reverse().toString());
            } else {
                joiner.add(string);
            }
        }
        return joiner.toString();
    }
}
