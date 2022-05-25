package com.codewars.kyu6.decodethemorsecode.main;

import java.util.regex.Pattern;

public class MorseCodeDecoder {
    private static final Pattern WORD_PATTERN = Pattern.compile(" {3}");
    private static final Pattern LETTER_PATTERN = Pattern.compile(" ");

    public static String decode(String morseCode) {
        StringBuilder builder = new StringBuilder();
        WORD_PATTERN.splitAsStream(morseCode.trim())
                .forEach(word -> builder.append(decodeWord(word)));
        return builder.toString().trim();
    }

    private static StringBuilder decodeWord(String word) {
        StringBuilder builder = new StringBuilder();
        LETTER_PATTERN.splitAsStream(word.trim())
                .forEach(letter -> builder.append(MorseCode.get(letter)));
        builder.append(" ");
        return builder;
    }
}
