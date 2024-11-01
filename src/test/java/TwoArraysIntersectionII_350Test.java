import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoArraysIntersectionII_350Test {

    TwoArraysIntersectionII_350 ta = new TwoArraysIntersectionII_350();

    @Test
    public void Test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2, 2};
        int[] output = ta.intersect(nums1, nums2);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        int[] expected = {4, 9};
        int[] output = ta.intersect(nums1, nums2);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {3, 5, 4};
        int[] expected = {3, 4};
        int[] output = ta.intersect(nums1, nums2);
        assertArrayEquals(expected, output);
    }
}