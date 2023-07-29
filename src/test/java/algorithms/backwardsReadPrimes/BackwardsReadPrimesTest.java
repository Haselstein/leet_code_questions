package algorithms.backwardsReadPrimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackwardsReadPrimesTest {

    BackwardsReadPrimes backwardsReadPrimes = new BackwardsReadPrimes();

    @Test
    void backwardsReadPrimes() {

        String actual = backwardsReadPrimes.backwardsReadPrimes(2, 100);
        String expected = "13 17 31 37 71 73 79 97";

        assertEquals(expected, actual);

    }

    @Test
    void isBackwardPrime() {

        boolean actual = backwardsReadPrimes.isBackwardPrime(13);
        boolean expected = true;

        assertEquals(expected, actual);

    }

    @Test
    void inverse() {

        long actual = backwardsReadPrimes.inverse(167);
        long expected = 761;

        assertEquals(expected, actual);

    }
}