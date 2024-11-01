import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftRightSum_2574Test {

    LeftRightSum_2574 lr = new LeftRightSum_2574();

    @Test
    public void Test1() {
        int[] input = {10,4,8,3};
        int[] expected = {15,1,11,22};
        int[] output = lr.leftRightDifference(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1};
        int[] expected = {0};
        int[] output = lr.leftRightDifference(input);
        assertArrayEquals(expected, output);
    }

}