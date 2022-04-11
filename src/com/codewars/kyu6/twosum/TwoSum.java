package com.codewars.kyu6.twosum;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        Arrays.stream(Arrays.stream(twoSum(new int[]{1, 2, 3}, 4)).toArray()).forEach(System.out::println);
    }


    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}