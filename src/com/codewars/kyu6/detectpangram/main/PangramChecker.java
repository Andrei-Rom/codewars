package com.codewars.kyu6.detectpangram.main;

public class PangramChecker {
    private static final int NUMBER_OF_LETTERS_IN_ENGLISH_ALPHABET = 26;

    public boolean check(String sentence) {
        return sentence.toLowerCase().chars().distinct().filter(Character::isAlphabetic).count() == NUMBER_OF_LETTERS_IN_ENGLISH_ALPHABET;
    }
}
