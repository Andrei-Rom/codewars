package com.codewars.kyu5.josephuspermutation.main;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    // 1, 2, 3, 4, 5, 6, 7}, 3 -> {3, 6, 2, 7, 5, 1, 4}
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        ArrayList result = new ArrayList();
        int m = items.size();
        int step = k - 1;
        int j = 0;
        for (int i = 0; i < m; i++) {
            j += step;
            while (j > items.size() - 1) {
                j -= items.size();
            }
            result.add(items.get(j));
            items.remove(j);
        }
        return result;
    }
}
