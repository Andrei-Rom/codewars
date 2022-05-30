package com.codewars.kyu6.helpthebookseller.main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HelpTheBookseller {

    // 1st parameter is the stocklist (L in example),
    // 2nd parameter is list of categories (M in example)
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length== 0) {
            return "";
        }
        Map<String, Integer> countMap = Arrays.stream(lstOf1stLetter).collect(HashMap::new, (hashMap, s) -> hashMap.put(s, 0), Map::putAll);
        for (String string : lstOfArt) {
            String[] split = string.split(" ");
            countMap.computeIfPresent(split[0].substring(0,1), (s1, integer) -> integer + Integer.parseInt(split[1]));
        }

        return countMap.entrySet().stream()
                .map(entry -> String.format("(%s : %d)", entry.getKey(), entry.getValue()))
                .collect(Collectors.joining(" - "));
    }
}
