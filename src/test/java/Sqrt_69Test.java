import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Sqrt_69Test {

    Sqrt_69 sqrt = new Sqrt_69();

    @Test
    public void Test1() {
        int input = 4;
        int expected = 2;
        int output = sqrt.mySqrt(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        // Explanation: The square root of 8 is 2.82842...,
        // and since we round it down to the nearest integer, 2 is returned.
        int input = 8;
        int expected = 2;
        int output = sqrt.mySqrt(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int input = 1024;
        int expected = 32;
        int output = sqrt.mySqrt(input);
        assertEquals(expected, output);
    }

}