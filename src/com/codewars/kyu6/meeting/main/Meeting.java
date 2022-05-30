package com.codewars.kyu6.meeting.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Meeting {
    public static String meeting(String s) {
        // s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        StringBuilder builder = new StringBuilder();
        List<String> result = new ArrayList<>();

        String[] friends = s.split(";");

        for (String friend : friends) {
            String[] personalName = friend.split(":");
            builder.append("(").append(personalName[1].toUpperCase())
                    .append(", ").append(personalName[0].toUpperCase()).append(")");
            result.add(builder.toString());
            builder.setLength(0);
        }
        Collections.sort(result);

        return String.join("", result);
    }
}
