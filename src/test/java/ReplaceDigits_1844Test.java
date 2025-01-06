import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceDigits_1844Test {

    ReplaceDigits_1844 rd = new ReplaceDigits_1844();

    @Test
    public void Test1() {
        String input = "a1c1e1";
        String expected = "abcdef";
        String output = rd.replaceDigits(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "a1b2c3d4e";
        String expected = "abbdcfdhe";
        String output = rd.replaceDigits(input);
        assertEquals(expected, output);
    }

}