package strings.longestPalindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromeTest {

    LongestPalindrome longestPalindrome = new LongestPalindrome();

    @Test
    void checkingAnswer() {

        String actual = longestPalindrome.longestPalindrome("abbac");
        String expected = "abba";

        assertEquals(expected, actual);

    }
}