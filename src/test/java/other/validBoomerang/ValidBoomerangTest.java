package other.validBoomerang;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class ValidBoomerangTest {

    ValidBoomerang validBoomerang = new ValidBoomerang();

    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }

    @Test
    void simpleStraightLine() {
        int[][] points = {{1,1},{2,2},{3,3}};
        boolean expected = false;
        boolean actual = validBoomerang.isBoomerang(points);

        assertEquals(expected, actual);
    }

    @Test
    void notSimpleStraightLine() {
        int[][] points = {{0,1},{2,2},{4,3}};
        boolean expected = false;
        boolean actual = validBoomerang.isBoomerang(points);

        assertEquals(expected, actual);
    }

    @Test
    void notStraightLine() {
        int[][] points = {{1,1},{2,3},{3,2}};
        boolean expected = true;
        boolean actual = validBoomerang.isBoomerang(points);

        assertEquals(expected, actual);
    }

}