package com.codewars.kyu7.squareeverydigit.main;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SquareDigit {

    public static void main(String[] args) {
        System.out.println(new SquareDigit().squareDigits(9119)); //811181
    }


    public int squareDigits(int n) {

        return String.valueOf(n)
                .chars()
                //.map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(x -> x - '0') // number 1 -> char 49 -> ('0' = 48) 49-48 -> 1
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.collectingAndThen(Collectors.joining(), Integer::parseInt));

//        return Integer.parseInt(Arrays.stream(Integer.toString(n).split(""))
//                        .map(s -> String.valueOf((int)Math.pow(Double.parseDouble(s), 2)))
//        .collect(Collectors.joining("")));



//        String nSt = Integer.toString(n);
//        int length = nSt.length();
//        String output = "";
//        for (int i = 0; i < length; i++) {
//            int a = Character.getNumericValue(nSt.charAt(i));
//            int b = a * a;
//            output = output + b;
//        }
//        int result = Integer.parseInt(output);
//        return result;

    }
}
