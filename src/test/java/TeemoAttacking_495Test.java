import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TeemoAttacking_495Test {

    TeemoAttacking_495 ta = new TeemoAttacking_495();

    @Test
    public void Test1() {
        int[] timeSeries = {1,4};
        int duration = 2;
        int expected = 4;
        int output = ta.findPoisonedDuration(timeSeries, duration);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] timeSeries = {1,2};
        int duration = 2;
        int expected = 3;
        int output = ta.findPoisonedDuration(timeSeries, duration);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] timeSeries = {1,2,3,4,5,6,7,8,9};
        int duration = 1;
        int expected = 9;
        int output = ta.findPoisonedDuration(timeSeries, duration);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] timeSeries = {1,2,3,4,5};
        int duration = 5;
        int expected = 9;
        int output = ta.findPoisonedDuration(timeSeries, duration);
        assertEquals(expected, output);
    }

}