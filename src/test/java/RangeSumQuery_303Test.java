import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RangeSumQuery_303Test {

    RangeSumQuery_303 sq = new RangeSumQuery_303();

    @Test
    public void Test1() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery_303.NumArray na = new RangeSumQuery_303.NumArray(nums);
        int left = 0;
        int right = 2;
        int expected = 1;
        int output = na.testMe(nums, left, right);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery_303.NumArray na = new RangeSumQuery_303.NumArray(nums);
        int left = 2;
        int right = 5;
        int expected = -1;
        int output = na.testMe(nums, left, right);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQuery_303.NumArray na = new RangeSumQuery_303.NumArray(nums);
        int left = 0;
        int right = 5;
        int expected = -3;
        int output = na.testMe(nums, left, right);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] nums = {-2};
        RangeSumQuery_303.NumArray na = new RangeSumQuery_303.NumArray(nums);
        int left = 0;
        int right = 0;
        int expected = -2;
        int output = na.testMe(nums, left, right);
        assertEquals(expected, output);
    }

}