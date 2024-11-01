import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BestTimeStock_121Test {

    BestTimeStock_121 bt = new BestTimeStock_121();

    @Test
    public void Test1() {
        int[] input = {7,1,5,3,6,4};
        int expected = 5;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {7,6,4,3,1};
        int expected = 0;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {2, 4, 1};
        int expected = 2;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = {3,2,6,5,0,3};
        int expected = 4;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[] input = {1,2};
        int expected = 1;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        int[] input = {6,1,3,2,4,7};
        int expected = 6;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        int[] input = {2,1,2,1,0,0,1};
        int expected = 1;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test8() {
        int[] input = {2,1,2,1,0,1,2};
        int expected = 2;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test9() {
        int[] input = {1,4,2};
        int expected = 3;
        int output = bt.maxProfit(input);
        assertEquals(expected, output);
    }

}