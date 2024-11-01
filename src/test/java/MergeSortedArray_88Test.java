/*
import org.junit.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MergeSortedArray_88Test {

    MergeSortedArray_88 ma = new MergeSortedArray_88();

    @Test
    public void Test1() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int[] expected = {1,2,2,3,5,6};
        int[] output = ma.merge(nums1, m, nums2, n);
        Arrays.stream(output).forEach(System.out::print);
        System.out.println(" ");
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};
        int[] output = ma.merge(nums1, m, nums2, n);
        Arrays.stream(output).forEach(System.out::print);
        System.out.println(" ");
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums1 = {};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        int[] output = ma.merge(nums1, m, nums2, n);
        Arrays.stream(output).forEach(System.out::print);
        System.out.println(" ");
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};
        int[] output = ma.merge(nums1, m, nums2, n);
        Arrays.stream(output).forEach(System.out::print);
        System.out.println(" ");
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[] nums1 = {-1,3,10,0,0,0};
        int m = 3;
        int[] nums2 = {-8,-2,1};
        int n = 3;
        int[] expected = {-8,-2,-1,1,3,10};
        int[] output = ma.merge(nums1, m, nums2, n);
        Arrays.stream(output).forEach(System.out::println);
        System.out.println(" ");
        assertArrayEquals(expected, output);
    }

}*/
