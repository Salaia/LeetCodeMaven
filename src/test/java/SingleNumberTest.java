import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNumberTest {

    SingleNumber sn = new SingleNumber();

    @Test
    public void Test1() {
        int[] input = {2,2,1};
        int result = sn.singleNumber(input);
        int expected = 1;
        assertEquals(expected, result);
    }

    @Test
    public void Test2() {
        int[] input = {4,1,2,1,2};
        int result = sn.singleNumber(input);
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void Test3() {
        int[] input = {1};
        int result = sn.singleNumber(input);
        int expected = 1;
        assertEquals(expected, result);
    }

}