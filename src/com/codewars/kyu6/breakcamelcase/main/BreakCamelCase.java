package com.codewars.kyu6.breakcamelcase.main;

public class BreakCamelCase {
    public static String camelCase(String input) {
        return input.replaceAll("([^_])([A-Z])", "$1 $2");
    }
}
