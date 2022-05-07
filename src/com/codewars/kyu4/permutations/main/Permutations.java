package com.codewars.kyu4.permutations.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static com.codewars.kyu4.permutations.main.PermutationsInteger.permute;

public class Permutations {

    public static List<String> singlePermutations(String s) {
        Set<String> set = new HashSet<>();
        if (s.isEmpty()) {
            return new ArrayList<>(set);
        }
        Character a = s.charAt(0);
        if (s.length() > 1) {
            s = s.substring(1);
            List<String> permSet = singlePermutations(s);
            for (String x : permSet) {
                for (int i = 0; i <= x.length(); i++) {
                    set.add(x.substring(0, i) + a + x.substring(i));
                }
            }
        } else {
            set.add(a + "");
        }
        return new ArrayList<>(set);
    }

    public static List<String> singlePermutationsUsingPositions(String s) {
        Set<String> set = new HashSet<>();
        StringBuilder builder = new StringBuilder();
        for (int[] positions : permute(s.length())) {
            builder.setLength(0);
            for (int i : positions) {
                builder.append(s.charAt(i));
            }
            set.add(builder.toString());
        }

        return new ArrayList<>(set);
    }
}