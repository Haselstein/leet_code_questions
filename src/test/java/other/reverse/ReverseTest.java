package other.reverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    Reverse reverse = new Reverse();

    @Test
    void reverse() {

        int actual = reverse.reverse(1463847412);
        int expected = 2147483641;

        assertEquals(expected, actual);

    }
}