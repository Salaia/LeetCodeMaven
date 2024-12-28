import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalPrices_1475Test {

    FinalPrices_1475 fp = new FinalPrices_1475();

    @Test
    public void Test1() {
        int[] input = {8,4,6,2,3};
        int[] expected = {4,2,4,2,3};
        int[] output = fp.finalPrices(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,2,3,4,5};
        int[] expected = {1,2,3,4,5};
        int[] output = fp.finalPrices(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {10,1,1,6};
        int[] expected = {9,0,1,6};
        int[] output = fp.finalPrices(input);
        assertArrayEquals(expected, output);
    }

}