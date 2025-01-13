import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAsterisks_2315Test {

    CountAsterisks_2315 ca = new CountAsterisks_2315();

    @Test
    public void Test1() {
        String input = "l|*e*et|c**o|*de|";
        int expected = 2;
        int output = ca.countAsterisks(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "iamprogrammer";
        int expected = 0;
        int output = ca.countAsterisks(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "yo|uar|e**|b|e***au|tifu|l";
        int expected = 5;
        int output = ca.countAsterisks(input);
        assertEquals(expected, output);
    }

}