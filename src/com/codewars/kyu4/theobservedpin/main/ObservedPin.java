package com.codewars.kyu4.theobservedpin.main;

import java.util.*;

public class ObservedPin {

    private static final Map<Character, String> pinMap = new HashMap<>() {{
        put('1', "124");
        put('2', "1235");
        put('3', "236");
        put('4', "1457");
        put('5', "24568");
        put('6', "3569");
        put('7', "478");
        put('8', "05789");
        put('9', "689");
        put('0', "08");
    }};

    public static List<String> getPINs(String observed) {

        List<String> pins = Arrays.asList("");
        for (char number : observed.toCharArray()) {
            List<String> tmp = new ArrayList<>();
            for (char key : pinMap.get(number).toCharArray()) {
                for (String pin : pins) {
                    tmp.add(pin + key);
                }
            }
            pins = tmp;
        }
        return pins;
    }
}