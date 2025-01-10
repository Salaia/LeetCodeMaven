import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Maximum69Number_1323Test {

    Maximum69Number_1323 mn = new Maximum69Number_1323();

    @Test
    public void Test1() {
        int input = 9669;
        int expected = 9969;
        int output = mn.maximum69Number(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int input = 9996;
        int expected = 9999;
        int output = mn.maximum69Number(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int input = 9999;
        int expected = 9999;
        int output = mn.maximum69Number(input);
        assertEquals(expected, output);
    }

}