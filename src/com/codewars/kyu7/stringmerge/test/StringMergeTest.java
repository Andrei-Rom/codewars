package com.codewars.kyu7.stringmerge.test;

import com.codewars.kyu7.stringmerge.main.StringMerge;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringMergeTest {
    @Test
    public void test1(){
        assertEquals("pere", StringMerge.stringMerge("person","here", 'e'));
    }
    @Test
    public void test2(){
        assertEquals("apowiejouh", StringMerge.stringMerge("apowiejfoiajsf","iwahfeijouh", 'j'));
    }
    @Test
    public void test3(){
        assertEquals("abcdefxxxyyyxyzz", StringMerge.stringMerge("abcdefxxxyzz","abcxxxyyyxyzz", 'x'));
    }
}
