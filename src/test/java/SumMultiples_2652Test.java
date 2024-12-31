import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumMultiples_2652Test {

    SumMultiples_2652 sm = new SumMultiples_2652();

    @Test
    public void Test1() {
        int n = 7;
        int expected = 21;
        int output = sm.sumOfMultiples(n);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int n = 10;
        int expected = 40;
        int output = sm.sumOfMultiples(n);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int n = 9;
        int expected = 30;
        int output = sm.sumOfMultiples(n);
        assertEquals(expected, output);
    }

}