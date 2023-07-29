package mathematics.persistance;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersistenceTest {

    Persistence persistence = new Persistence();

    @Test
    void checkingAnswer() {

        int actual = persistence.persistence(441888);
        int expected = 4;

        assertEquals(expected, actual);

    }
}