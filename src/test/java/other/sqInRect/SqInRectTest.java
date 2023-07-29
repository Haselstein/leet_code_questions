package other.sqInRect;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SqInRectTest {

    SqInRect sqInRect = new SqInRect();

    List<Integer> actual = sqInRect.sqInRect(3, 7);
    int[] expected = {3, 3, 1, 1, 1};

    @Test
    void checkLengths() {

        int actualLength = actual.size();
        int expectedLength = expected.length;

        assertEquals(expectedLength, actualLength);

    }

    @Test
    void sqInRect() {

        for (int i = 0; i < actual.size(); i++)
            assertEquals(expected[i], actual.get(i));

    }
}