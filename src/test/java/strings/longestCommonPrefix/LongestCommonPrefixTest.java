package strings.longestCommonPrefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    @Test
    void longestCommonPrefix() {

        String[] strs = {"car","career","carcar"};
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        String expected = "car";

        assertEquals(expected, actual);

    }

    @Test
    void notNull() {

        String[] strs = {""};
        String actual = longestCommonPrefix.longestCommonPrefix(strs);
        String expected = "";

        assertEquals(expected, actual);

    }
}