package com.codewars.kyu6.reverseorrotate.main;

public class RevRot {
    public static String revRot(String strng, int sz) {
        if (sz <= 0 || sz > strng.length()) {
            return "";
        }
        strng = strng.substring(0, strng.length() - (strng.length() % sz));

        String[] chunks = strng.split("(?<=\\G.{" + sz + "})");

        for (int i = 0; i < chunks.length; i++) {
            chunks[i] = chunks[i].chars().map(k -> k * k * k).sum() % 2 == 0
                    ? (new StringBuilder(chunks[i])).reverse().toString()
                    : (new StringBuilder(chunks[i])).append(chunks[i].charAt(0)).deleteCharAt(0).toString();
        }

        return String.join("", chunks);
    }
}
