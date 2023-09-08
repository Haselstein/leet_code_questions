package algorithms.availableCapturesForRook;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;

import static org.junit.jupiter.api.Assertions.*;

class AvailableCapturesForRookTest {

    AvailableCapturesForRook availableCapturesForRook = new AvailableCapturesForRook();

    @ParameterizedTest
    @NullSource
    void testMethodNullSource(Integer argument) {
        assertNull(argument);
    }

    @Test
    void checkThreeFreePawnInThreeDirection() {
        char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','R','.','.','.','p'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        int actual = availableCapturesForRook.numRookCaptures(board);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void checkZeroFreePawnCauseBishopAreBlockedMoving() {
        char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        int actual = availableCapturesForRook.numRookCaptures(board);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void checkThreePawnMixedWithBishopBehindSomePawns() {
        char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'p','p','.','R','.','p','B','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','B','.','.','.','.'},{'.','.','.','p','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        int actual = availableCapturesForRook.numRookCaptures(board);
        int expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    void checkThreePawnOnBorderOfBoard() {
        char[][] board =  {{'.','.','.','.','.','.','p','.'},{'p','.','.','.','.','.','R','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','p','.'}};
        int actual = availableCapturesForRook.numRookCaptures(board);
        int expected = 3;
        assertEquals(expected, actual);
    }

}