package com.codewars.kyu6.duplicateencoder.main;

public class DuplicateEncoder {
    public static String encode(String word){
        // "(" - once
        // ")" - more than once
        char[] encode = new char[word.length()];
        String s = word.toLowerCase();
        int temp;
        for (int i = 0; i < s.length(); i++) {
            temp =0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    temp++;
                }
            }
            if (temp >1) {
                encode[i] = ')';
            } else {
                encode[i] = '(';
            }
        }
        return new String(encode);
    }
}
