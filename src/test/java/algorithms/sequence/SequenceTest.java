package algorithms.sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {

    Sequence sequence = new Sequence();

    @Test
    void sequence() {

        int actual = sequence.sequence(new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4});
        int expected = 6;

        assertEquals(expected, actual);

    }
}