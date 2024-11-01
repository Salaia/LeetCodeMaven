import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    RomanToInteger rti = new RomanToInteger();

    @Test
    public void Test1() {
        String input = "III";
        int expected = 3;
        int result = rti.romanToInt(input);
        assertEquals(expected, result);
    }

    @Test
    public void Test2() {
        String input = "LVIII";
        int expected = 58;
        int result = rti.romanToInt(input);
        assertEquals(expected, result);
    }

    @Test
    public void Test3() {
        String input = "MCMXCIV";
        int expected = 1994;
        int result = rti.romanToInt(input);
        assertEquals(expected, result);
    }

}