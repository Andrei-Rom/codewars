package com.codewars.kyu6.makethedeadfishswim.main;

import java.util.ArrayList;
import java.util.List;

public class DeadFish {
    // i d s o
    public static int[] parse(String data) {
        List<Integer> arrayList = new ArrayList<>();
        int temp = 0;
        for (String s : data.split("")) {
            switch (s) {
                case "i" -> temp++;
                case "d" -> temp--;
                case "s" -> temp = (int) Math.pow(temp, 2);
                case "o" -> arrayList.add(temp);
            }
        }
        return arrayList.stream().mapToInt(Integer::valueOf).toArray();
    }
}
