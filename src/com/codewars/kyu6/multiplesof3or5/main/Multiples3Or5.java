package com.codewars.kyu6.multiplesof3or5.main;

import java.util.stream.IntStream;

public class Multiples3Or5 {

    public int solution(int number) {
        return IntStream.range(0, number)
                .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                .sum();
//        if (number < 0) return 0;
//        int result = 0;
//        for (int i = 3; i < number; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                result = result + i;
//            }
//        }
//        return result;
    }
}

