import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSum_2656Test {

    MaximumSum_2656 ms = new MaximumSum_2656();

    @Test
    public void Test1() {
        int[] input = {1,2,3,4,5};
        int k = 3;
        int expected = 18;
        int output = ms.maximizeSum(input, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {5,5,5};
        int k = 2;
        int expected = 11;
        int output = ms.maximizeSum(input, k);
        assertEquals(expected, output);
    }

}