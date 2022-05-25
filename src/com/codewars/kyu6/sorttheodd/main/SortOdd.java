package com.codewars.kyu6.sorttheodd.main;

import java.util.ArrayList;
import java.util.List;

public class SortOdd {

    public static int[] sortArray(int[] array) {
        List<Integer> odds = new ArrayList<>();
        for (int k : array) {
            if (k % 2 != 0) {
                odds.add(k);
            }
        }
        odds.sort(Integer::compareTo);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odds.get(j);
                j++;
            }
        }
        return array;
    }
}
