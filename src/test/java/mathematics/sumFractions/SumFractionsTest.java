package mathematics.sumFractions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumFractionsTest {

    SumFractions sumFractions = new SumFractions();

    @Test
    void sumFractions() {

        int[][] array = new int[][] { {1,2}, {2,9}, {3,18}, {4,24}, {6,48} };
        String actual = sumFractions.sumFractions(array);
        String expected = "[85, 72]";

        assertEquals(expected, actual);

    }

    @Test
    void findGreatestCommonDivisor() {

        int actual = sumFractions.findGreatestCommonDivisor(40, 16);
        int expected = 8;

        assertEquals(expected, actual);

    }

    @Test
    void findLeastCommonMultipleForTwoNumbers() {

        int a = 2;
        int b = 9;

        int actual = sumFractions.findLeastCommonMultiple(a, b);
        int expected = 18;

        assertEquals(expected, actual);

    }

    @Test
    void findLeastCommonMultipleForArrays() {

        int[] temp = {2, 9, 18, 24, 48};
        int actual = sumFractions.findLeastCommonMultiple(temp);
        int expected = 144;

        assertEquals(expected, actual);

    }
}