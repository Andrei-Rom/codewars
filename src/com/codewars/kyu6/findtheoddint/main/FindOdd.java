package com.codewars.kyu6.findtheoddint.main;

import java.util.HashSet;
import java.util.Set;

public class FindOdd {
    public static int findIt(int[] a) {
        Set<Integer> set = new HashSet<>();
        for (int i : a) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }
        return set.stream().findAny().get();
    }
}

