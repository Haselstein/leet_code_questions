package other.removeDuplicates;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    RemoveDuplicates removeDuplicates = new RemoveDuplicates();

    @Test
    void removeDuplicates() {

        int[] nums = new int[] {1, 2, 2, 3, 9, 10, 10, 10, 11};
        int actual = removeDuplicates.removeDuplicates(nums);
        int expected = 6;

        assertEquals(expected, actual);

    }
}