import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodPairsI_3162Test {

    GoodPairsI_3162 gp = new GoodPairsI_3162();

    @Test
    public void Test1() {
        int[] nums1 = {1,3,4};
        int[] nums2 = {1,3,4};
        int k = 1;
        int expected = 5;
        int output = gp.numberOfPairs(nums1, nums2, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums1 = {1,2,4,12};
        int[] nums2 = {2,4};
        int k = 3;
        int expected = 2;
        int output = gp.numberOfPairs(nums1, nums2, k);
        assertEquals(expected, output);
    }
}