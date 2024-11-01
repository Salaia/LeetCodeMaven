import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MinElementAfterReplace_3300Test {

    MinElementAfterReplace_3300 me = new MinElementAfterReplace_3300();

    @Test
    public void Test1() {
        int[] input = {10, 12, 13, 14};
        int expected = 1;
        int output = me.minElement(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,2,3,4};
        int expected = 1;
        int output = me.minElement(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {999,19,199};
        int expected = 10;
        int output = me.minElement(input);
        assertEquals(expected, output);
    }

}