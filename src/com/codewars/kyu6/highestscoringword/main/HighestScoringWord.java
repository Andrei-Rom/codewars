package com.codewars.kyu6.highestscoringword.main;

import java.util.*;

public class HighestScoringWord {
    public static String high(String s) {
        /// best practice
//        return Arrays.stream(s.split(" "))
//                .max(Comparator.comparingInt(
//                        a -> a.chars().map(i -> i - 96).sum()
//                )).get();
        ///

        String[] strings = s.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : strings) {
            int value = 0;
            for (char letter : word.toCharArray()) {
                int temp = letter - 96;
                value += temp;
            }
            map.put(word, value);
        }
        Optional<Map.Entry<String, Integer>> maxEntry = map.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        return map.entrySet().stream().filter(e -> e.getValue().equals(maxEntry.get().getValue())).map(Map.Entry::getKey).findFirst().orElse(null);
    }
}
