package algorithms.sumDigPow;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SumDigPowTest {

    SumDigPow sumDigPow = new SumDigPow();

    List<Long> actual =  sumDigPow.sumDigPow(1, 1000);
    Long[] expected = {1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L, 89L, 135L, 175L, 518L, 598L};

    @Test
    void checkLength() {

        int actualLength = actual.size();
        int expectedLength = expected.length;

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void sumDigPow() {

        for (int i = 0; i < actual.size(); i++)
            assertEquals(expected[i], actual.get(i));

    }

    @Test
    void isEureka() {

        boolean actual = sumDigPow.isEureka(135); // 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135
        boolean expected = true;

        assertEquals(expected, actual);

    }

}