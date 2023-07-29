package mathematics.digitalRoot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalRootTest {

    DigitalRoot digitalRoot = new DigitalRoot();

    @Test
    void checkingAnswer() {

        int actual = digitalRoot.digital_root(347149);
        int expected = 1;

        assertEquals(expected, actual);

    }
}