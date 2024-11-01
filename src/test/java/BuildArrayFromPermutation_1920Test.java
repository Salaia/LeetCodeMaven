import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildArrayFromPermutation_1920Test {

    BuildArrayFromPermutation_1920 ba = new BuildArrayFromPermutation_1920();

    @Test
    public void Test1() {
        int[] input = {0,2,1,5,3,4};
        int[] expected = {0,1,2,4,5,3};
        int[] output = ba.buildArray(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {5,0,1,2,3,4};
        int[] expected = {4,5,0,1,2,3};
        int[] output = ba.buildArray(input);
        assertArrayEquals(expected, output);
    }

}