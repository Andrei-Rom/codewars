package com.codewars.kyu4.humanreadabledurationformat.main;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        StringBuilder builder = new StringBuilder();

        int years = seconds / 31536000;
        int days = seconds / 86400 % 365;
        int hours = seconds / 3600 % 24;
        int minutes = seconds / 60 % 60;
        int second = seconds % 60;
        List<String> time = new ArrayList<>();

        if (years > 0) {
            time.add(years == 1 ? "1 year" : (years + " years"));
        }
        if (days > 0) {
            time.add(days == 1 ? "1 day" : (days + " days"));
        }
        if (hours > 0) {
            time.add(hours == 1 ? "1 hour" : (hours + " hours"));
        }
        if (minutes > 0) {
            time.add(minutes == 1 ? "1 minute" : (minutes + " minutes"));
        }
        if (second > 0) {
            time.add(second == 1 ? "1 second" : (second + " seconds"));
        }

        if (time.size() == 1) {
            return time.get(0);
        } else {
            for (int i = 0; i < time.size() - 1; i++) {
                builder.append(time.get(i)).append(", ");
            }

            builder.delete(builder.lastIndexOf(","), builder.lastIndexOf(" "));
            return builder.append("and ").append(time.get(time.size() - 1)).toString();
        }

    }
}
