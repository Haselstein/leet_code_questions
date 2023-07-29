package algorithms.playingWithDigits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingWithDigitsTest {

    PlayingWithDigits playingWithDigits = new PlayingWithDigits();

    @Test
    void case1() {

        int actual = playingWithDigits.playingWithDigits(89, 1);
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    void case2() {

        int actual = playingWithDigits.playingWithDigits(92, 1);
        int expected = -1;

        assertEquals(expected, actual);

    }

    @Test
    void case3() {

        int actual = playingWithDigits.playingWithDigits(695, 2);
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    void case4() {

        int actual = playingWithDigits.playingWithDigits(46288, 3);
        int expected = 51;

        assertEquals(expected, actual);

    }

}