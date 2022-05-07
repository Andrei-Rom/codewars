package com.codewars.kyu4.permutations.test;

import com.codewars.kyu4.permutations.main.Permutations;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;


public class PermutationsTest {

    @Test
    public void example1() {
        assertEquals(new ArrayList<>(Arrays.asList("a")),
                Permutations.singlePermutations("a").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example1UsingPositions() {
        assertEquals(new ArrayList<>(Arrays.asList("a")),
                Permutations.singlePermutationsUsingPositions("a").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example2() {
        assertEquals(new ArrayList<>(Arrays.asList("ab", "ba")),
                Permutations.singlePermutations("ab").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example2UsingPositions() {
        assertEquals(new ArrayList<>(Arrays.asList("ab", "ba")),
                Permutations.singlePermutationsUsingPositions("ab").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example3() {
        assertEquals(new ArrayList<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutations("aabb").stream().sorted().collect(Collectors.toList()));
    }

    @Test
    public void example3UsingPositions() {
        assertEquals(new ArrayList<>(Arrays.asList("aabb", "abab", "abba", "baab", "baba", "bbaa")),
                Permutations.singlePermutationsUsingPositions("aabb").stream().sorted().collect(Collectors.toList()));
    }
}
