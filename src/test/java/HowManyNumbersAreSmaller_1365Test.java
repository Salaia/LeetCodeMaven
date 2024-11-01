import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HowManyNumbersAreSmaller_1365Test {

    HowManyNumbersAreSmaller_1365 hm = new HowManyNumbersAreSmaller_1365();

    @Test
    public void Test1() {
        int[] input = {8,1,2,2,3};
        int[] expected = {4,0,1,1,3};
        int[] output = hm.smallerNumbersThanCurrent(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {6,5,4,8};
        int[] expected = {2,1,0,3};
        int[] output = hm.smallerNumbersThanCurrent(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {7,7};
        int[] expected = {0,0};
        int[] output = hm.smallerNumbersThanCurrent(input);
        assertArrayEquals(expected, output);
    }

}