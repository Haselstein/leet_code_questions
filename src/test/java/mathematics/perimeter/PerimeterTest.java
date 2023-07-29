package mathematics.perimeter;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class PerimeterTest {

    Perimeter perimeter = new Perimeter();

    @Test
    void perimeter() {

        BigInteger actual = perimeter.perimeter(BigInteger.valueOf(7));
        BigInteger expected = BigInteger.valueOf(216);

        assertEquals(expected, actual);

    }
}