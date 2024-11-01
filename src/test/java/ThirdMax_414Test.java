import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMax_414Test {

    ThirdMax_414 tm = new ThirdMax_414();

    @Test
    public void Test1() {
        int[] input = {3,2,1};
        int expected = 1;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,2};
        int expected = 2;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {2,2,3,1};
        int expected = 1;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = {1};
        int expected = 1;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[] input = {-2,-2,-3,-1};
        int expected = -3;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        int[] input = {1,2,2,5,3,5};
        int expected = 2;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        int[] input = {5,2,2};
        int expected = 5;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test8() {
        int[] input = {-2147483648,3,2};
        int expected = -2147483648;
        int output = tm.thirdMax(input);
        assertEquals(expected, output);
    }

}