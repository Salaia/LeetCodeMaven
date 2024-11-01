import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayConcatenation_1929Test {
    ArrayConcatenation_1929 ac = new ArrayConcatenation_1929();

    @Test
    public void Test1() {
        int[] input = {1,2,1};
        int[] output = ac.getConcatenation(input);
        int[] expected = {1,2,1,1,2,1};
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,3,2,1};
        int[] output = ac.getConcatenation(input);
        int[] expected = {1,3,2,1,1,3,2,1};
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1};
        int[] output = ac.getConcatenation(input);
        int[] expected = {1,1};
        assertArrayEquals(expected, output);
    }

}