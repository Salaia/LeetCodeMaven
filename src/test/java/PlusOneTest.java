import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    public PlusOne po = new PlusOne();

    @Test
    public void Test1() {
        int[] input = {1, 2, 3};
        int[] output = po.plusOne(input);
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {4, 3, 2, 1};
        int[] output = po.plusOne(input);
        int[] expected = {4, 3, 2, 2};
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {9};
        int[] output = po.plusOne(input);
        int[] expected = {1, 0};
        assertArrayEquals(expected, output);
    }
}