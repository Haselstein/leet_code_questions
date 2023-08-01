package strings.lengthOfLongestSubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLongestSubstringTest {

    LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();

    @Test
    void test1() {

        int actual = lengthOfLongestSubstring.lengthOfLongestSubstring("abcda");
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    void test2() {

        int actual = lengthOfLongestSubstring.lengthOfLongestSubstring("aaaaa");
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void test3() {

        int actual = lengthOfLongestSubstring.lengthOfLongestSubstring("aaab");
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    void test4() {

        int actual = lengthOfLongestSubstring.lengthOfLongestSubstring("");
        int expected = 0;

        assertEquals(expected, actual);

    }

}