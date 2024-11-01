import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class TwoArraysIntersection_349Test {
    TwoArraysIntersection_349 ta = new TwoArraysIntersection_349();

    @Test
    public void Test1() {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] expected = {2};
        int[] output = ta.intersection(nums1, nums2);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] expected = {4,9};
        int[] output = ta.intersection(nums1, nums2);
        assertArrayEquals(expected, output);
    }
}