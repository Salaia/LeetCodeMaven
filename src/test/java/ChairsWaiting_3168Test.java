import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChairsWaiting_3168Test {

    ChairsWaiting_3168 cw = new ChairsWaiting_3168();

    @Test
    public void Test1() {
        String input = "EEEEEEE";
        int expected = 7;
        int output = cw.minimumChairs(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "ELELEEL";
        int expected = 2;
        int output = cw.minimumChairs(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "ELEELEELLL";
        int expected = 3;
        int output = cw.minimumChairs(input);
        assertEquals(expected, output);
    }

}