package strings.romanToInt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntTest {

    RomanToInt romanToInt = new RomanToInt();

    @Test
    void romanToInt() {

        int actual = romanToInt.romanToInt("MCMXCIV");
        int expected = 1994;

        assertEquals(expected, actual);

    }
}