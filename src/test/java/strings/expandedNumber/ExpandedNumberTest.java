package strings.expandedNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpandedNumberTest {

    ExpandedNumber expandedNumber = new ExpandedNumber();

    @Test
    void checkExpandedNumber() {

        int a = 70304;
        String actual = expandedNumber.expandedNumber(a);
        String expected = "70000 + 300 + 4";

        assertEquals(expected, actual);

    }

}