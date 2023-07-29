package mathematics.multiples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {

    Multiples multiples = new Multiples();

    @Test
    void checkingAnswer() {

        int actual = multiples.multiples(10);
        int expected = 23;

        assertEquals(expected, actual);

    }
}