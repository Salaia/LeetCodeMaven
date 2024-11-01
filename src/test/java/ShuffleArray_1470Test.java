import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleArray_1470Test {

    ShuffleArray_1470 sa = new ShuffleArray_1470();

    @Test
    public void Test1() {
        int[] input = {2,5,1,3,4,7};
        int n = 3;
        int[] expected = {2,3,5,4,1,7};
        int[] output = sa.shuffle(input, n);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,2,3,4,4,3,2,1};
        int n = 4;
        int[] expected = {1,4,2,3,3,2,4,1};
        int[] output = sa.shuffle(input, n);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1,1,2,2};
        int n = 2;
        int[] expected = {1,2,1,2};
        int[] output = sa.shuffle(input, n);
        assertArrayEquals(expected, output);
    }
}