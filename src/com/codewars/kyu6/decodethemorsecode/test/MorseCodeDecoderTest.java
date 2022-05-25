package com.codewars.kyu6.decodethemorsecode.test;

import com.codewars.kyu6.decodethemorsecode.main.MorseCodeDecoder;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class MorseCodeDecoderTest {
    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
    }
}
