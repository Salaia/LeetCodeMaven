import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToLowerCase_709Test {

    ToLowerCase_709 lc = new ToLowerCase_709();

    @Test
    public void Test1() {
        String input = "Hello";
        String expected = "hello";
        String output = lc.toLowerCase(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test9() {
        String input = "al&phaBET";
        String expected = "al&phabet";
        String output = lc.toLowerCase(input);
        assertEquals(expected, output);
    }

}