package other.findMissingNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {

    FindMissingNumber findMissingNumber = new FindMissingNumber();

    @Test
    void findMissingNumber() {

        int[] a = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };   // Отсутствует 5
        int actual = findMissingNumber.findMissingNumber(a);
        int expected = 5;

        assertEquals(expected, actual);

    }
}