package algorithms.foldArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoldArrayTest {

    FoldArray foldArray = new FoldArray();

    int[] input = { 1, 2, 3, 4, 5 };

    @Test
    void foldArray() {

        int[] actual = foldArray.foldArray(input, 2);
        int[] expected = {9, 6};

        for (int i = 0; i < actual.length; i++)
            assertEquals(expected[i], actual[i]);

    }

}