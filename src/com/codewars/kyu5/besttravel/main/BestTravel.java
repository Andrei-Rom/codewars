package com.codewars.kyu5.besttravel.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BestTravel {
    public static void main(String[] args) {

        System.out.println(chooseBestSum(250,5, new ArrayList<>(Arrays.asList(10,5,150,18,25,36,92,16,98)))); //249
        System.out.println(chooseBestSum(163,3, new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58)))); //163

    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        // t - maxDistance
        // k - numberOfTowns
        int result = 0;
        List<int[]> combinations = generate(ls.size(), k);
        for (int[] combination: combinations) {
            int temp =0;
            for (int i = 0; i < k; i++) {
                temp += ls.get(combination[i]);
            }
            if (temp > result && temp <= t) {
                result = temp;
            }
        }

        return result == 0 ? null : result;
    }

    private static void helper(List<int[]> combinations, int data[], int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }

    public static List<int[]> generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        helper(combinations, new int[r], 0, n-1, 0);
        return combinations;
    }

}
