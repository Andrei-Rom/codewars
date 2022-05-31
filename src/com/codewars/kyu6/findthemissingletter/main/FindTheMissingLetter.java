package com.codewars.kyu6.findthemissingletter.main;

public class FindTheMissingLetter {
    private static String ENGLISH_ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static char findMissingLetter(char[] array) {
        String alphabet;
        if (Character.isUpperCase(array[0])) {
            alphabet = ENGLISH_ALPHABET.toUpperCase();
        } else {
            alphabet = ENGLISH_ALPHABET;
        }
        String string = alphabet.substring(alphabet.indexOf(array[0]));

        for (int i = 0; i < array.length; i++) {
            if (string.charAt(i) != array[i]) {
                return string.charAt(i);
            }
        }
        return ' ';
    }

    public static char findMissingLetterBetter(char[] array) {
        char missingLetter = array[0];
        for (char letter : array) {
            if (missingLetter != letter) {
                break;
            }
            missingLetter++;
        }
        return missingLetter;
    }

}