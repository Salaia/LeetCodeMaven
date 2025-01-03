import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RingsRods_2103Test {

    RingsRods_2103 rr = new RingsRods_2103();

    @Test
    public void Test1() {
        String input = "B0B6G0R6R0R6G9";
        int expected = 1;
        int output = rr.countPoints(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "B0R0G0R9R0B0G0";
        int expected = 1;
        int output = rr.countPoints(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "G4";
        int expected = 0;
        int output = rr.countPoints(input);
        assertEquals(expected, output);
    }

}