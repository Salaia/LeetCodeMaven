import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDigits_2520Test {

    CountDigits_2520 count = new CountDigits_2520();

    @Test
    public void Test1() {
        int input = 7;
        int expected = 1;
        int output = count.countDigits(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int input = 121;
        int expected = 2;
        int output = count.countDigits(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int input = 1248;
        int expected = 4;
        int output = count.countDigits(input);
        assertEquals(expected, output);
    }
}