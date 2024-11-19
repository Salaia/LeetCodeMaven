import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestEvenMultiple_2413Test {

    SmallestEvenMultiple_2413 se = new SmallestEvenMultiple_2413();

    @Test
    public void Test1() {
        int input = 5;
        int expected = 10;
        int output = se.smallestEvenMultiple(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int input = 6;
        int expected = 6;
        int output = se.smallestEvenMultiple(input);
        assertEquals(expected, output);
    }

}