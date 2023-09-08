package strings.ransomNote;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {

    @ParameterizedTest(name = "Iteration #{index} -> ransomNote = {0}, magazine = {1}, should be = {2}")
    @CsvSource({
            "'a', 'b', false",
            "'aa', 'ab', false",
            "'aa', 'aab', true",
            "'aaab', 'baaa', true",
            "'baaa', 'aaab', true"
    })
    void checkValues(String ransomNote, String magazine, boolean expectedResult) {
        boolean actual = RansomNote.ransomNote(ransomNote, magazine);
        assertEquals(expectedResult, actual);
    }

}