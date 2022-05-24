package com.codewars.kyu6.convertstringtocamelcase.main;

public class ConvertStringToCamelCase {

    public static String toCamelCase(String s) {
        String[] strings = s.split("[-_]");
        StringBuilder builder = new StringBuilder();
        builder.append(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            builder.append(Character.toUpperCase(strings[i].charAt(0)));
            builder.append(strings[i].substring(1));
        }
        return builder.toString();
    }
}
