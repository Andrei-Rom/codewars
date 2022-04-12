package com.codewars.kyu6.findtheuniquenumber.main;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniq {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{10, 5, 150, 18, 25, 36, 92, 25, 16, 98, 10, 5, 150, 18, 92, 25, 16, 98})); //36
        System.out.println(findUniq2(new double[]{1, 1, 1, 2, 1, 1, 1})); //2
    }

    public static double findUniq(double[] arr) {
        return Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).findFirst().get().getKey();
    }

    public static double findUniq2(double[] arr) {
        Arrays.sort(arr);
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }
}
