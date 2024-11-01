import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberGame_2974Test {

    MinimumNumberGame_2974 mg = new MinimumNumberGame_2974();

    @Test
    public void Test1() {
        int[] input = {5,4,2,3};
        int[] expected = {3,2,5,4};
        int[] output = mg.numberGame(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {2,5};
        int[] expected = {5,2};
        int[] output = mg.numberGame(input);
        assertArrayEquals(expected, output);
    }

}