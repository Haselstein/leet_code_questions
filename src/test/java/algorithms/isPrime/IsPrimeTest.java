package algorithms.isPrime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsPrimeTest {

    IsPrime isPrime = new IsPrime();

    @Test
    void isPrimeInt() {

        boolean actual = isPrime.isPrime(53);
        boolean expected = true;

        assertEquals(expected, actual);

    }

}