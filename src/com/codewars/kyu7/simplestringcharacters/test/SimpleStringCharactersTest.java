package com.codewars.kyu7.simplestringcharacters.test;
import com.codewars.kyu7.simplestringcharacters.main.SimpleStringCharacters;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class SimpleStringCharactersTest {
    @Test
    public void testSomething() {
        assertArrayEquals(new int[]{1,18,3,2}, SimpleStringCharacters.solve("Codewars@codewars123.com"));
        assertArrayEquals(new int[]{8,6,3,2}, SimpleStringCharacters.solve("CbgA5<1d-tOwUZTS8yQ"));
        assertArrayEquals(new int[]{9,9,6,9}, SimpleStringCharacters.solve("P*K4%>mQUDaG$h=cx2?.Czt7!Zn16p@5H"));
        assertArrayEquals(new int[]{15,8,6,9}, SimpleStringCharacters.solve("RYT'>s&gO-.CM9AKeH?,5317tWGpS<*x2ukXZD"));
        assertArrayEquals(new int[]{10,7,3,6}, SimpleStringCharacters.solve("$Cnl)Sr<7bBW-&qLHI!mY41ODe"));
        assertArrayEquals(new int[]{7,13,4,10}, SimpleStringCharacters.solve("@mw>0=QD-iAx!rp9TaG?o&M%l$34L.nbft"));
    }
}
