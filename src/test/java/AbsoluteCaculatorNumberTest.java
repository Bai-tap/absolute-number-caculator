

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteCaculatorNumberTest {
    @Test
    void findAbsolute0() {
        int number = 0;
        int expected = 0;

        int resutlt = AbsoluteCaculatorNumber.findAbsolute(number);
        assertEquals(expected, resutlt);
    }

    @Test
    void findAbsolute1() {
        int number = 1;
        int expected = 1;

        int result = AbsoluteCaculatorNumber.findAbsolute(number);
        assertEquals(expected, result);
    }

    @Test
    void findAbsoluteNegative1() {
        int number = -1;
        int expected = 1;

        int result = AbsoluteCaculatorNumber.findAbsolute(number);
        assertEquals(expected, result);
    }
}