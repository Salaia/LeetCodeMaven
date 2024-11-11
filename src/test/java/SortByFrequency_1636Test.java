import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortByFrequency_1636Test {

    SortByFrequency_1636 sf = new SortByFrequency_1636();

    @Test
    public void Test1() {
        int[] input = {1,1,2,2,2,3};
        int[] expected = {3,1,1,2,2,2};
        int[] output = sf.frequencySort(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {2,3,1,3,2};
        int[] expected = {1,3,3,2,2};
        int[] output = sf.frequencySort(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {-1,1,-6,4,5,-6,1,4,1};
        int[] expected = {5,-1,4,4,-6,-6,1,1,1};
        int[] output = sf.frequencySort(input);
        assertArrayEquals(expected, output);
    }

}