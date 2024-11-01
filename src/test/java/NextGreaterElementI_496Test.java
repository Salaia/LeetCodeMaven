import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextGreaterElementI_496Test {

    NextGreaterElementI_496 ge = new NextGreaterElementI_496();

    @Test
    public void Test1() {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] expected = {-1,3,-1};
        int[] output = ge.nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        int[] expected = {3,-1};
        int[] output = ge.nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};
        int[] expected = {7,7,7,7,7};
        int[] output = ge.nextGreaterElement(nums1, nums2);
        assertArrayEquals(expected, output);
    }

}