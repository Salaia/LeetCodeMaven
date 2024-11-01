import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    MajorityElement majorityElement = new MajorityElement();

    @Test
    public void Test1() {
        int[] input = {3,2,3};
        int output = majorityElement.majorityElement(input);
        int expected = 3;
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {2,2,1,1,1,2,2};
        int output = majorityElement.majorityElement(input);
        int expected = 2;
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {42};
        int output = majorityElement.majorityElement(input);
        int expected = 42;
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = {1,1,1,2,2,2,1};
        int output = majorityElement.majorityElement(input);
        int expected = 1;
        assertEquals(expected, output);
    }
}