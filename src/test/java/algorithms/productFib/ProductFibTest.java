package algorithms.productFib;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductFibTest {

    ProductFib productFib = new ProductFib();

    long[] actual = productFib.productFib(4895);
    long[] expected = {55, 89, 1};

    @Test
    void checkLength() {

        int actualLength = actual.length;
        int expectedLength = expected.length;

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void productFib() {

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }
}