import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumber268Test {

    MissingNumber_268 missingNumber268 = new MissingNumber_268();

    @Test
    public void Test1() {
        int[] input = {3,0,1};
        int output = missingNumber268.missingNumber(input);
        int expected = 2;
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {0,1};
        int output = missingNumber268.missingNumber(input);
        int expected = 2;
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {9,6,4,2,3,5,7,0,1};
        int output = missingNumber268.missingNumber(input);
        int expected = 8;
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = {0};
        int output = missingNumber268.missingNumber(input);
        int expected = 1;
        assertEquals(expected, output);
    }

}