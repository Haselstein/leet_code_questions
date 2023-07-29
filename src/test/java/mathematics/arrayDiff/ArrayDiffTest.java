package mathematics.arrayDiff;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayDiffTest {

    ArrayDiff arrayDiff = new ArrayDiff();

    int[] a = {1, 2, 3, 3, 2, 4};
    int[] b = {2, 3};

    int[] actual = arrayDiff.arrayDiff(a, b);
    int[] expected = {1, 4};

    @Test
    void checkLengths() {

        int actualLength = actual.length;
        int expectedLength = expected.length;

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void checkArrayDiff() {

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }

}