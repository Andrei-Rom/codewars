package com.codewars.kyu7.creditcardmask.main;

public class Maskify {
    public static String maskify(String str) {

        if (str.length() <=4) {
            return str;
        }
        String temp = str.substring(str.length()-4);
        StringBuilder builder = new StringBuilder();
        builder.append("#".repeat(str.length() - 4));
        builder.append(temp);
        return builder.toString();
    }
}
