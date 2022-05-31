package com.codewars.kyu6.deleteoccurrenceselements.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        if (elements.length == 0 || maxOccurrences == 0) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int element : elements) {
            if (map.get(element) == null) {
                list.add(element);
                map.put(element, 1);
            } else if (map.get(element) < maxOccurrences) {
                list.add(element);
                map.put(element, map.get(element) + 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
