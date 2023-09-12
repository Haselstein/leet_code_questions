package algorithms.rotateArray;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {

    RotateArray rotateArray = new RotateArray();

    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }

    @Test
    void rotateTo3() {

        int[] points = {1,2,3,4,5,6,7};
        int[] expected = {5,6,7,1,2,3,4};
        int k = 3;
        int[] actual = rotateArray.rotate(points, k);

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }

    @Test
    void rotateTo10WhenSizeEquals7() {

        int[] points = {1,2,3,4,5,6,7};
        int[] expected = {5,6,7,1,2,3,4};
        int k = 10;
        int[] actual = rotateArray.rotate(points, k);

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }

    @Test
    void rotateTo2() {

        int[] points = {-1,-100,3,99};
        int[] expected = {3,99,-1,-100};
        int k = 2;
        int[] actual = rotateArray.rotate(points, k);

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }

}