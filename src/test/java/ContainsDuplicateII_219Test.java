import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContainsDuplicateII_219Test {

    ContainsDuplicateII_219 cd = new ContainsDuplicateII_219();

    @Test
    public void Test1() {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums = {1,0,1,1};
        int k = 1;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        boolean expected = false;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] nums = {99,99};
        int k = 2;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[] nums = {1,2,3,4,6,2,8,2};
        int k = 2;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        int[] nums = {0,1,2,3,4,0,0,7,8,9,10,11,12,0};
        int k = 1;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        int[] nums = {1,1,3,4,5,6,7,1};
        int k = 3;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test8() {
        int[] nums = {0,1,2,3,2,5};
        int k = 3;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test9() {
        int[] nums = {1,2,1,4,5};
        int k = 4;
        boolean expected = true;
        boolean output = cd.containsNearbyDuplicate(nums, k);
        assertEquals(expected, output);
    }

}