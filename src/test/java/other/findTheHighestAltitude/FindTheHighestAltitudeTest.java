package other.findTheHighestAltitude;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class FindTheHighestAltitudeTest {

    FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();

    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }

    @Test
    void simpleArrayShouldReturn1() {

        int[] source = {-5,1,5,0,-7};
        int expected = 1;
        int actual = findTheHighestAltitude.largestAltitude(source);

        assertEquals(expected, actual);

    }

    @Test
    void simpleArrayShouldReturn0() {

        int[] source = {-4,-3,-2,-1,4,3,2};
        int expected = 0;
        int actual = findTheHighestAltitude.largestAltitude(source);

        assertEquals(expected, actual);

    }

    @Test
    void simpleArrayShouldReturn36() {

        int[] source = {9,4,3,5,9,4,2};
        int expected = 36;
        int actual = findTheHighestAltitude.largestAltitude(source);

        assertEquals(expected, actual);

    }

}