import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfUnique_1748Test {

    SumOfUnique_1748 su = new SumOfUnique_1748();

    @Test
    public void Test1() {
        int[] input = {1,2,3,2};
        int expected = 4;
        int output = su.sumOfUnique(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,1,1,1,1};
        int expected = 0;
        int output = su.sumOfUnique(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1,2,3,4,5};
        int expected = 15;
        int output = su.sumOfUnique(input);
        assertEquals(expected, output);
    }

}