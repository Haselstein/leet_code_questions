package other.getConcatenation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetConcatenationTest {

    GetConcatenation getConcatenation = new GetConcatenation();

    int[] a = {2, 4, 5};
    int[] actual = getConcatenation.getConcatenation(a);
    int[] expected = {2, 4, 5, 2, 4, 5};

    @Test
    void checkLength() {

        int actualLength = actual.length;
        int expectedLength = expected.length;

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void getConcatenation() {

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }
}