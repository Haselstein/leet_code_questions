package other.looseChange;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class LooseChangeTest {

    LooseChange looseChange= new LooseChange();

    @Test
    void looseChange() {

        HashMap<String, Integer> actual = looseChange.looseChange(91);

        HashMap<String, Integer> expected =new HashMap<>();
        expected.put("Pennies", 1);
        expected.put("Nickels", 1);
        expected.put("Dimes", 1);
        expected.put("Quarters", 3);

        assertEquals(expected, actual);

    }
}