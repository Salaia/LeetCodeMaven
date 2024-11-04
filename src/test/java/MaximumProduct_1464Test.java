import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumProduct_1464Test {

    MaximumProduct_1464 mp = new MaximumProduct_1464();

    @Test
    public void Test1() {
        int[] input = {3,4,5,2};
        int expected = 12;
        int output = mp.maxProduct(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,5,4,5};
        int expected = 16;
        int output = mp.maxProduct(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {3,7};
        int expected = 12;
        int output = mp.maxProduct(input);
        assertEquals(expected, output);
    }

}