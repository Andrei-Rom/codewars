package com.codewars.kyu8.convertNumberToReversedArrayOfDigits.test;




import com.codewars.kyu8.convertNumberToReversedArrayOfDigits.main.ConvertNumberToReversedArray;
import org.junit.Test;
        import static org.junit.Assert.assertArrayEquals;

public class ConvertNumberToReversedArrayTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumberToReversedArray.digitize(35231));
        assertArrayEquals(new int[] {0}, ConvertNumberToReversedArray.digitize(0));
    }
}