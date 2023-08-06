package strings.intToRoman;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class IntToRomanTest {

    IntToRoman intToRoman = new IntToRoman();


    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }


    @ParameterizedTest(name = "Iteration #{index} -> int number = {0}, string roman = {1}")
    @CsvSource({
            "3, 'III'",
            "58, 'LVIII'",
            "1994, 'MCMXCIV'"
    })
    void checkValues(int actualInt, String expectedString) {
        String actual = intToRoman.intToRoman(actualInt);
        assertEquals(expectedString, actual);
    }

}