package com.codewars.kyu7.alphabetsymmetry.main;

import java.util.ArrayList;
import java.util.List;

public class AlphabetSymmetry {
    public static int[] solve(String[] arr) {
        List<Integer> result = new ArrayList<>();
        for (String string : arr) {
            int temp = 0;
            for (int i = 0; i < string.length(); i++) {
                int t = string.toLowerCase().charAt(i) - 'a';
                if (t == i) {
                    temp++;
                }
            }
            result.add(temp);
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}
