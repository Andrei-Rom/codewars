package com.codewars.kyu5.simplepiglatin;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PigLatin {
    public static void main(String[] args) {
        System.out.println(pigIt("Pig latin is cool")); // igPay atinlay siay oolcay
        System.out.println(pigIt("Hello world !")); // elloHay orldway !
    }
    public static String pigIt(String str) {
        return Arrays.stream(str.split(" "))
                .map((s) -> Character.isLetter(s.charAt(0)) ? (s.substring(1) + s.charAt(0)+ "ay") : s)
                .collect(Collectors.joining(" "));
    }
}
