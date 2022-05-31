package com.codewars.kyu6.validbraces.main;

public class ValidBraces {
    public boolean isValid(String braces) {
        boolean replaced;
        do {
            int length = braces.length();
            braces = braces.replaceAll("\\{\\}", "").replaceAll("\\(\\)", "").replaceAll("\\[\\]", "");
            replaced = braces.length() < length;
        } while (replaced);

        return braces.isEmpty();
    }
}
