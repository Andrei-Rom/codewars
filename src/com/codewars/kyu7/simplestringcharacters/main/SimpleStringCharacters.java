package com.codewars.kyu7.simplestringcharacters.main;

public class SimpleStringCharacters {
    public static int[] solve(String word) {
        //uppercase letters, lowercase, numbers and special characters.
        int[] result = new int[4];

        for (char c : word.toCharArray()) {
            if ((int) c >= 65 && (int) c < 91) {
                result[0]++;
            }
            if ((int) c >= 97 && (int) c < 123) {
                result[1]++;
            }
            if ((int) c >= 48 && (int) c < 58) {
                result[2]++;
            }
        }
        result[3] = word.length() - result[0] - result[1] - result[2];
        return result;
    }
}
