import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateTargetArray_1389Test {

    CreateTargetArray_1389 ct = new CreateTargetArray_1389();

    @Test
    public void Test1() {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] expected = {0,4,1,3,2};
        int[] output = ct.createTargetArray(nums, index);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        int[] expected = {0,1,2,3,4};
        int[] output = ct.createTargetArray(nums, index);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums = {1};
        int[] index = {0};
        int[] expected = {1};
        int[] output = ct.createTargetArray(nums, index);
        assertArrayEquals(expected, output);
    }

}