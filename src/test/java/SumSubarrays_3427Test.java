import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumSubarrays_3427Test {

    SumSubarrays_3427 ss = new SumSubarrays_3427();

    @Test
    public void Test1() {
        int[] input = {2,3,1};
        int expected = 11;
        int output = ss.subarraySum(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {3,1,1,2};
        int expected = 13;
        int output = ss.subarraySum(input);
        assertEquals(expected, output);
    }

}