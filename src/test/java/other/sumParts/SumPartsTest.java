package other.sumParts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumPartsTest {

    SumParts sumParts = new SumParts();

    int[] ls = {0, 1, 3, 6, 10};
    int[] actual = sumParts.sumParts(ls);
    int[] expected = {20, 20, 19,16, 10, 0};


    @Test
    void checkingLength() {
        assertEquals(expected.length, actual.length);
    }

    @Test
    void checkingAnswer() {
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }

}