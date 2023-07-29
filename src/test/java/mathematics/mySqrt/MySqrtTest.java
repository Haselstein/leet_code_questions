package mathematics.mySqrt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySqrtTest {

    MySqrt mySqrt = new MySqrt();

    @Test
    void mySqrt() {

        int actual = mySqrt.mySqrt(65536);
        int expected = 256;

        assertEquals(expected, actual);

    }
}