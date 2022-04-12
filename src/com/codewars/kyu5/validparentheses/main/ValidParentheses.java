package com.codewars.kyu5.validparentheses.main;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses("()()"));
        System.out.println(validParentheses("())(()"));
        System.out.println(validParentheses("0d(_j((((\\(j(qM)(z(5{(RsEGWN6o)+dYf6t)ji)@)n4Nu7_-S)KK,)uoYbT)yVo[)Nx5tP9}A)"));
        System.out.println(validParentheses("()"));
        System.out.println(validParentheses("32423(sgsdg)"));
        System.out.println(validParentheses(")("));
        System.out.println(validParentheses("(435)t)4(2"));
        System.out.println(validParentheses("iB^))-8(())((k):()3Q(5"));
        System.out.println(validParentheses(""));


    }

    public static boolean validParentheses(String parens) {
        int count = 0;

        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(') {
                count++;
            }
            else if (parens.charAt(i) == ')') {
                count--;
            }
            if (count < 0) return false;
        }
        return count == 0;

//        String temp = Arrays.stream(parens.split("")).filter(s -> s.equals("(") || s.equals(")")).collect(Collectors.joining());
//        if (temp.length() == 0) return true;
//        if (temp.length() % 2 != 0) return false;
//        if (temp.charAt(0) == ')') return false;
//        if (temp.charAt(temp.length() - 1) == '(') return false;
//
//        Stack stack = new Stack();
//        stack.push(temp.charAt(0));
//        for (int i = 1; i < temp.length(); i++) {
//            if (stack.empty() && temp.charAt(i) == ')') return false;
//            if (temp.charAt(i) == ')' && (char) stack.peek() == '(') {
//                stack.pop();
//            } else {
//                stack.push(temp.charAt(i));
//            }
//        }
//        return stack.empty();
    }
}
