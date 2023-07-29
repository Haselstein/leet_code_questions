package strings.inArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InArrayTest {

    InArray inArray = new InArray();

    String[] a = new String[] { "arp", "live", "strong" };
    String[] b = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };

    String[] actual = inArray.inArray(a, b);
    String[] expected = {"arp", "live", "strong"};

    @Test
    void checkLength() {

        int actualLength = actual.length;
        int expectedLength = expected.length;

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void checkInArray() {

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }

}