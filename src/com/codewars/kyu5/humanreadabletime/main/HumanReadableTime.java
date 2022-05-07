package com.codewars.kyu5.humanreadabletime.main;

public class HumanReadableTime {
    //HH:MM:SS
    public static String makeReadable(int seconds) {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }
}
