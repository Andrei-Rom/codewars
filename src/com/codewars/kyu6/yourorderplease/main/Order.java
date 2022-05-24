package com.codewars.kyu6.yourorderplease.main;

public class Order {
    public static String order(String words) {
        if (words.equals("")) {
            return "";
        }
        String[] strings = words.split(" ");
        String[] result = new String[strings.length];
        for (String string : strings) {
            for (char c : string.toCharArray()) {
                if (Character.isDigit(c)) {
                    result[Character.getNumericValue(c) - 1] = string;
                }
            }
        }
        return String.join(" ", result);
    }
}
