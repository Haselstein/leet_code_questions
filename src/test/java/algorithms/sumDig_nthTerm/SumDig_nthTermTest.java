package algorithms.sumDig_nthTerm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumDig_nthTermTest {

    SumDig_nthTerm sumDigNthTerm = new SumDig_nthTerm();

    @Test
    void sumDig_nthTerm() {

        int[] patternL = {1, 2, 3};
        int actual = sumDigNthTerm.sumDig_nthTerm(10, patternL, 6);

        // Последовательность будет следующей:
        // 1) 10 + 1 = 11
        // 2) 11 + 2 = 13
        // 3) 13 + 3 = 16
        // 4) 16 + 1 = 18
        // 5) 17 + 2 = 19
        // Так как в тесте до 6-й последовательности не включительно, на этом работа остановится
        // А сумма цифр числа 19: 1 + 9 = 10

        int expected = 10;

        assertEquals(expected, actual);

    }

    @Test
    void checkSumOfTheDigits() {

        int number = 521;
        int actual = sumDigNthTerm.sumOfTheDigits(number);
        int expected = 8; // 5 + 2 + 1 = 8

        assertEquals(expected, actual);

    }

}