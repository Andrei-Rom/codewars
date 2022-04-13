package com.codewars.kyu5.josephussurvivor.main;

import java.util.ArrayList;
import java.util.List;

public class JosephusSurvivor {

    public static int josephusSurvivor(final int n, final int k) {
        // n = quantity of elements
        int step = k - 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int j = 0;
        int z = n;
        for (int i = 0; i < n - 1; i++) {
            j += step;
            while (j > z-1) {
                j -= z;
            }
            list.remove(j);
            z --;
        }
        return list.get(0);
    }
}
