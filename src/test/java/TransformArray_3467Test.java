import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformArray_3467Test {

    TransformArray_3467 ta = new TransformArray_3467();

    @Test
    public void Test1() {
        int[] input = {4,3,2,1};
        int[] expected = {0,0,1,1};
        int[] output = ta.transformArray(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,5,1,4,2};
        int[] expected = {0,0,1,1,1};
        int[] output = ta.transformArray(input);
        assertArrayEquals(expected, output);
    }

}