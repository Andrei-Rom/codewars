package com.codewars.kyu7.evenodddisparity.main;

public class EvenOddDisparity {
    public static int evenOddDisparity(int[] array) {
        int even = 0;
        int odd = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return even - odd;
    }
}
