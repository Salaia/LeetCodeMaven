import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfGoodPairs_1512Test {

    NumberOfGoodPairs_1512 gp = new NumberOfGoodPairs_1512();

    @Test
    public void Test1() {
        int[] input = {1,2,3,1,1,3};
        int expected = 4;
        int output = gp.numIdenticalPairs(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,1,1,1};
        int expected = 6;
        int output = gp.numIdenticalPairs(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1,2,3};
        int expected = 0;
        int output = gp.numIdenticalPairs(input);
        assertEquals(expected, output);
    }
}