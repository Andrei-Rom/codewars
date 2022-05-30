package com.codewars.kyu6.validphonenumber.main;

public class ValidPhoneNumber {
    // "(123) 456-7890"
    public static final String REGEX_PHONE_NUMBER = "\\(\\d{3}\\) \\d{3}-\\d{4}";

    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_PHONE_NUMBER);
    }
}