import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayByParity_905Test {


    SortArrayByParity_905 sa = new SortArrayByParity_905();

    @Test
    public void Test1() {
        int[] input = {3, 1, 2, 4};
        int[] expected = {2, 4, 1, 3};
        int[] output = sa.sortArrayByParity(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {0};
        int[] expected = {0};
        int[] output = sa.sortArrayByParity(input);
        assertArrayEquals(expected, output);
    }
}