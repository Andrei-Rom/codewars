package com.codewars.kyu6.takeatenminuteswalk.main;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int latitude = 0;

        int longitude = 0;

        for (char c : walk) {
            if (c == 'n') latitude++;
            if (c == 's') latitude--;
            if (c == 'e') longitude++;
            if (c == 'w') longitude--;
        }
        return (latitude == 0 && longitude == 0);
    }
}
