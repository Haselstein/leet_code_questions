package mathematics.myPow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPowTest {

    MyPow myPow = new MyPow();

    @Test
    void PositiveDigPositivePow() {

        double actual = myPow.myPow(4, 3);
        double expected = 64;

        assertEquals(expected, actual);

    }

    @Test
    void PositiveDigNegativePow() {

        double actual = myPow.myPow(4, -3);
        double expected = 0.015625;

        assertEquals(expected, actual);

    }

    @Test
    void NegativeDigPositivePow() {

        double actual = myPow.myPow(-4, 3);
        double expected = -64;

        assertEquals(expected, actual);

    }

    @Test
    void NegativeDigNegativePow() {

        double actual = myPow.myPow(-4, -3);
        double expected = -0.015625;

        assertEquals(expected, actual);

    }
}