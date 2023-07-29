package other.removeElement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    RemoveElement removeElement = new RemoveElement();

    @Test
    void removeElement() {

        int[] a = new int[] {0,1,2,2,3,0,4,2};
        int actual = removeElement.removeElement(a, 2);
        int expected = 5;

        assertEquals(expected, actual);

    }
}