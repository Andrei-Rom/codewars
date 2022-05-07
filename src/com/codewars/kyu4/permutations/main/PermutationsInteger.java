package com.codewars.kyu4.permutations.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PermutationsInteger {
    private static List<int[]> permutations;

    public static List<int[]> permute (int i) {
        permutations = new ArrayList<>();
        List<Integer> positions = Stream.iterate(0, n -> n + 1).limit(i).collect(Collectors.toList());
        permute(positions, 0);
        return permutations;
    }

    private static void permute (List<Integer> arr, int k) {
        for(int i = k; i < arr.size(); i++){
            Collections.swap(arr, i, k);
            permute(arr, k+1);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1){
            permutations.add(arr.stream().mapToInt(i->i).toArray());
        }
    }
}
