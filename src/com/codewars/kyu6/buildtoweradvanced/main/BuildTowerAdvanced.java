package com.codewars.kyu6.buildtoweradvanced.main;

public class BuildTowerAdvanced {
    public static String[] towerBuilder(int nFloors, int blockWidth, int blockHeight) {
        String pattern = "*".repeat(blockWidth);
        String[] result = new String[nFloors * blockHeight];

        for (int i = 0, k = 1; i < nFloors * blockHeight; i += blockHeight, k++) {
            for (int j = 0; j < blockHeight; j++) {
                result[i + j] = " ".repeat(blockWidth * (nFloors - k)) + pattern.repeat(k * 2 - 1) + " ".repeat(blockWidth * (nFloors - k));
            }
        }
        return result;
    }
}
