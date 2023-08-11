package other.plusOne;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    PlusOne plusOne = new PlusOne();


    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }

    @Test
    void check123to124() {
        int[] digits = {1, 2, 3};
        int[] expectedDigits = {1, 2, 4};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);
    }

    @Test
    void check248to249() {
        int[] digits = {2, 4, 8};
        int[] expectedDigits = {2, 4, 9};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);
    }

    @Test
    void check789to790() {
        int[] digits = {7, 8, 9};
        int[] expectedDigits = {7, 9, 0};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);
    }

    @Test
    void check999to1000() {
        int[] digits = {9, 9, 9};
        int[] expectedDigits = {1, 0, 0, 0};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);
    }

    // 9,8,7,6,5,4,3,2,1,0
    @Test
    void check9876543210to9876543211() {

        int[] digits ={9,8,7,6,5,4,3,2,1,0};
        int[] expectedDigits ={9,8,7,6,5,4,3,2,1,1};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);

    }

    @Test
    void check8999to9000() {
        int[] digits = {8, 9, 9, 9};
        int[] expectedDigits = {9, 0, 0, 0};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);
    }

    @Test
    void check99to100() {
        int[] digits = {9, 9};
        int[] expectedDigits = {1, 0, 0};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);
    }

    @Test
    void check9to10() {
        int[] digits = {9};
        int[] expectedDigits = {1, 0};

        int[] actual = plusOne.plusOne(digits);
        for (int i = 0; i < actual.length; i++)
            assertEquals(expectedDigits[i], actual[i]);
    }


}