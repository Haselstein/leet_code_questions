package mathematics.salaryBonus;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryBonusTest {

    SalaryBonus salaryBonus = new SalaryBonus();

    int[] a = {30, 27, 8, 14, 7};
    long[] actual = salaryBonus.bonus(a, 34067);
    long[] expected = {2772, 3080, 10395, 5940, 11880};

    @Test
    void checkingLength() {
        assertEquals(expected.length, actual.length);
    }

    @Test
    void checkingAnswer() {
        for (int i = 0; i < actual.length; i++) {
            assertEquals(expected[i], actual[i]);
        }
    }


}