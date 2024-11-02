import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAverage_3194Test {

    MinimumAverage_3194 ma = new MinimumAverage_3194();

    @Test
    public void Test1() {
        int[] input = {7,8,3,4,15,13,4,1};
        double expected = 5.5;
        double output = ma.minimumAverage(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,9,8,3,10,5};
        double expected = 5.5;
        double output = ma.minimumAverage(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1,2,3,7,8,9};
        double expected = 5.0;
        double output = ma.minimumAverage(input);
        assertEquals(expected, output);
    }

}