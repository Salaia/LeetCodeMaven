import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightChecker_1051Test {

    HeightChecker_1051 hc = new HeightChecker_1051();

    @Test
    public void Test1() {
        int[] input = {1,1,4,2,1,3};
        int expected = 3;
        int output = hc.heightChecker(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {5,1,2,3,4};
        int expected = 5;
        int output = hc.heightChecker(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1,2,3,4,5};
        int expected = 0;
        int output = hc.heightChecker(input);
        assertEquals(expected, output);
    }

}