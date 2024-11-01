import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumSquares_2778Test {

    SumSquares_2778 sq = new SumSquares_2778();

    @Test
    public void Test1() {
        int[] input = {1, 2, 3, 4};
        int expected = 21;
        int output = sq.sumOfSquares(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {2,7,1,19,18,3};
        int expected = 63;
        int output = sq.sumOfSquares(input);
        assertEquals(expected, output);
    }

}