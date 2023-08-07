package strings.firstOccurrenceInString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class FirstOccurrenceInStringTest {

    FirstOccurrenceInString firstOccurrenceInString = new FirstOccurrenceInString();


    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }

    @ParameterizedTest(name = "Iteration #{index} -> haystack = {0}, needle = {1}, should be {2}")
    @CsvSource({
            "butsad, sad, 3",
            "leetcode, leet, 0",
            "leetcode, leeto, -1"
    })
    void checkValues(String haystack, String needle, int expectedInt) {
        int actual = firstOccurrenceInString.firstOccurrenceInString(haystack, needle);
        assertEquals(expectedInt, actual);
    }

}