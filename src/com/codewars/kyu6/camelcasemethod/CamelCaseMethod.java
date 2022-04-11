package com.codewars.kyu6.camelcasemethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;


public class CamelCaseMethod {
    public static void main(String[] args) {
        System.out.println(camelCase("hello case")); // => "HelloCase"
        System.out.println(camelCase("camel case word")); // => "CamelCaseWord"
        System.out.println(camelCase(" camel case word")); // => "CamelCaseWord"
        System.out.println(camelCase(" c")); // => "C"
        System.out.println(camelCase("c")); // => "C"
        System.out.println(camelCase("")); // => ""
        System.out.println(camelCase(" ")); // => ""
        System.out.println(camelCase("ab  c")); // => "AbC"
        System.out.println(camelCase("a    b  c   ")); // => "AbC"
        System.out.println(camelCase("hello case")); // => "HelloCase"

    }

    public static String camelCase(String str) {
//        if (str.length() == 0 || str.equals(" ")) return "";
//        ArrayList<String> strings = new ArrayList<String>(Arrays.asList(str.split(" ")));
//
//        StringBuilder stringBuilder = new StringBuilder();
//        for (String s : strings) {
//            if (!s.equals(""))
//            stringBuilder.append(s.substring(0, 1).toUpperCase(Locale.ROOT)).append(s.substring(1));
//        }
//        return stringBuilder.toString();
//        return Arrays.stream(str.split("\\s+")).toList().stream().map(s -> s.substring(0, 1).toUpperCase(Locale.ROOT) + s.substring(1)).collect(Collectors.joining());

        return Arrays.stream(str.split("\\s+"))
                .filter(s-> !s.isEmpty())
                .map(s -> s.substring(0, 1).toUpperCase(Locale.ROOT) + s.substring(1))
                .collect(Collectors.joining());
    }
}
