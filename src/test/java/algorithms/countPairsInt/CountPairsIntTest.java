package algorithms.countPairsInt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountPairsIntTest {

    CountPairsInt countPairsInt = new CountPairsInt();

    @Test
    void checkCountDivisors() {

        int actual = countPairsInt.countDivisors(6);
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    void checkCountPairsInt() {

        int actual = countPairsInt.countPairsInt(3, 100);
        int expected = 7;

        assertEquals(expected, actual);

    }
}