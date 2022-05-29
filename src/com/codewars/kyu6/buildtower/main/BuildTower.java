package com.codewars.kyu6.buildtower.main;

public class BuildTower {
    public static String[] towerBuilder(int nFloors) {
        String[] result = new String[nFloors];

        for (int i = 0; i < nFloors; i++) {
            result[i] = " ".repeat(nFloors - 1 - i) + "*".repeat((i + 1) * 2 - 1) + " ".repeat(nFloors - 1 - i);
        }
        return result;
    }
}
