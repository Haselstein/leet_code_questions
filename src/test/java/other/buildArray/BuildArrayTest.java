package other.buildArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayTest {

    BuildArray buildArray = new BuildArray();

    int[] a = {5,0,1,2,3,4};
    int[] actual = buildArray.buildArray(a);
    int[] expected = {4, 5, 0, 1, 2, 3};

    @Test
    void checkLength() {

        int actualLength = actual.length;
        int expectedLength = expected.length;

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void buildArray() {

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }
}