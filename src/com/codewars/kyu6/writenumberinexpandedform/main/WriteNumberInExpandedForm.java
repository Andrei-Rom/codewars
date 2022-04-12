package com.codewars.kyu6.writenumberinexpandedform.main;

public class WriteNumberInExpandedForm {
    public static void main(String[] args) {
        System.out.println(expandedForm(12)); //"10 + 2"
        System.out.println(expandedForm(42)); //"40 + 2"
        System.out.println(expandedForm(70304)); //"70000 + 300 + 4"
    }

    public static String expandedForm(int num) {
        StringBuilder result = new StringBuilder();
        int decimal = 1;
        while (num > 0) {
            int temp = num % 10;
            if (temp != 0) {
                result.insert(0, temp * decimal + " + ");
            }
            decimal *= 10;
            num /= 10;
        }
        return result.substring(0, result.length() - 3);
    }
}
