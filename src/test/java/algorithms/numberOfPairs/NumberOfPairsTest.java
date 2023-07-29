package algorithms.numberOfPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfPairsTest {

    NumberOfPairs numberOfPairs = new NumberOfPairs();

    String[] b = {"red", "green", "blue", "blue", "red", "green", "red", "red", "red"};
    // 2 пары красных, по 1 паре синих и зелёных. 1 красная без пары

    @Test
    void checkNumberOfPairs() {

        int actual = numberOfPairs.numberOfPairs(b);
        int expected = 4;

        assertEquals(expected, actual);

    }

}