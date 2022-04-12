package com.codewars.kyu4.recoverasecretstringfromrandomtriplets.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SecretDetective {
    public static void main(String[] args) {

        System.out.println(recoverSecret(new char[][] {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        })); //whatisup
    }

    public static String recoverSecret(char[][] triplets) {
        List<Character> characterList = getCharacterList(triplets);

        boolean reordered = true;

        while (reordered) {
            reordered = false;
            for (char[] triplet : triplets) {
                if (reorder(characterList, triplet[0], triplet[1])
                        || reorder(characterList, triplet[1], triplet[2])) {

                    reordered = true;
                }
            }
        }
        return characterList.stream()
                .map(String::valueOf)
                .reduce(String::concat)
                .get();
    }

    public static boolean reorder(List<Character> list, char c1, char c2) {
        if (list.indexOf(c1) > list.indexOf(c2)) {
            list.remove(c1);
            list.add(list.indexOf(c2), c1);
            return true;
        }
        return false;
    }

    public static List<Character> getCharacterList(char[][] triplets) {
                return Arrays.stream(triplets)
                .map(String::valueOf)
                .map(s -> s.codePoints()
                        .mapToObj(codePoint -> (char) codePoint)
                        .collect(Collectors.toList())
                )
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }
}
