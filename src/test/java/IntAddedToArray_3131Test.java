import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntAddedToArray_3131Test {

    IntAddedToArray_3131 ia = new IntAddedToArray_3131();

    @Test
    public void Test1() {
        int[] nums1 = {2,6,4};
        int[] nums2 = {9,7,5};
        int expected = 3;
        int output = ia.addedInteger(nums1, nums2);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums1 = {10};
        int[] nums2 = {5};
        int expected = -5;
        int output = ia.addedInteger(nums1, nums2);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums1 = {1,1,1,1};
        int[] nums2 = {1,1,1,1};
        int expected = 0;
        int output = ia.addedInteger(nums1, nums2);
        assertEquals(expected, output);
    }

}