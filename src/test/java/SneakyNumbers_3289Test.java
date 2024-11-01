import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SneakyNumbers_3289Test {

    SneakyNumbers_3289 sn = new SneakyNumbers_3289();

    @Test
    public void Test1() {
        int[] input = {0,1,1,0};
        int[] expected = {1,0};
        int[] output = sn.getSneakyNumbers(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {0,3,2,1,3,2};
        int[] expected = {3,2};
        int[] output = sn.getSneakyNumbers(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {7,1,5,4,3,4,6,0,9,5,8,2};
        int[] expected = {4,5};
        int[] output = sn.getSneakyNumbers(input);
        assertArrayEquals(expected, output);
    }

}