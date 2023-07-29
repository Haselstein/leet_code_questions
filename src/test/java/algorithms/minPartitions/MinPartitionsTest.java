package algorithms.minPartitions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPartitionsTest {

    MinPartitions minPartitions = new MinPartitions();

    @Test
    void minPartitions() {

        String str = "27346209830709182346";
        int actual = minPartitions.minPartitions(str);
        int expected = 9;

        assertEquals(expected, actual);

    }
}