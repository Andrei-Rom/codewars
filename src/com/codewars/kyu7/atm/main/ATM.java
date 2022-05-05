package com.codewars.kyu7.atm.main;

public class ATM {
    private final static int[] NOMINALS = new int[]{500, 200, 100, 50, 20, 10};

    public int solve(int n) {
        if (n % 10 != 0) return -1;
        int countOfBanknotes = 0;
        for (int nominal : NOMINALS) {
            countOfBanknotes += n / nominal;
            n %= nominal;
        }
        return countOfBanknotes;
    }
}
