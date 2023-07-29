package algorithms.findMedianSortedArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianSortedArraysTest {

    FindMedianSortedArrays findMedianSortedArrays = new FindMedianSortedArrays();

    @Test
    void findMedianSortedArrays() {

        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        float actual = findMedianSortedArrays.findMedianSortedArrays(a, b);
        float expected = 3.5f;

        assertEquals(expected, actual);

    }
}