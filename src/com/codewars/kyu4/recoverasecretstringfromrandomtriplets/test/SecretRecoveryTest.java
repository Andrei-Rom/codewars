package com.codewars.kyu4.recoverasecretstringfromrandomtriplets.test;

import com.codewars.kyu4.recoverasecretstringfromrandomtriplets.main.SecretDetective;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SecretRecoveryTest {

    @Test public void secret1() {
        char[][] triplets = {
                {'t','u','p'},
                {'w','h','i'},
                {'t','s','u'},
                {'a','t','s'},
                {'h','a','p'},
                {'t','i','s'},
                {'w','h','s'}
        };
        assertEquals("whatisup", SecretDetective.recoverSecret(triplets));
    }
}