package com.codewars.kyu6.persistentbugger.main;

public class Persist {
    public static int persistence(long n) {
        int persist = 0;
        int temp;

        while (n > 9) {
            temp = 1;
            while (n > 0) {
                temp *= n % 10;
                n /= 10;
            }
            n = temp;
            persist++;
        }
        return persist;
    }
}