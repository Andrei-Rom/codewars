package com.codewars.kyu6.thesupermarketqueue;

import java.util.Arrays;

public class TheSupermarketQueue {
    public static void main(String[] args) {
        System.out.println(solveSuperMarketQueue(new int[]{5, 3, 4}, 1)); //12
        System.out.println(solveSuperMarketQueue(new int[]{10, 2, 3, 3}, 2)); //10
        System.out.println(solveSuperMarketQueue(new int[]{}, 1)); //0
        System.out.println(solveSuperMarketQueue(new int[]{2, 3, 10}, 2)); //12
        System.out.println(solveSuperMarketQueue(new int[]{2, 2, 3, 3, 4, 4}, 2)); //9
        System.out.println(solveSuperMarketQueue(new int[]{2, 2, 13, 3, 4, 4}, 2)); //15
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (n == 1) {
            return Arrays.stream(customers).sum();
        }
        if (customers.length == 0) {
            return 0;
        }
        int[] tills = new int[n];
        for (int customer : customers) {
            tills[0] += customer;
            Arrays.sort(tills);
        }
        return tills[n - 1];
    }
}

