package com.codewars.kyu4.romannumeralshelper.main;


import java.util.HashMap;

public class RomanNumeralsHelper {

    // input range : 1 <= n < 4000
    public static String toRoman(int n) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLiterals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                n -= values[i];
                roman.append(romanLiterals[i]);
            }
        }
        return roman.toString();
    }

    // input range : 1 <= n < 4000
    public static int fromRoman(String romanNumeral) {
        if (romanNumeral == null || romanNumeral.length() == 0) {
            return -1;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int len = romanNumeral.length();
        int result = map.get(romanNumeral.charAt(len - 1));
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(romanNumeral.charAt(i)) >= map.get(romanNumeral.charAt(i + 1)))
                result += map.get(romanNumeral.charAt(i));
            else
                result -= map.get(romanNumeral.charAt(i));
        }
        return result;
    }
}