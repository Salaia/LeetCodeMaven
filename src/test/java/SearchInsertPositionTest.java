import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    SearchInsertPosition insertPosition = new SearchInsertPosition();

    @Test
    public void Test1() {
        int[] nums = {1,3,5,6};
        int target = 5;
        int expected = 2;
        int output = insertPosition.searchInsert(nums, target);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] nums = {1,3,5,6};
        int target = 2;
        int expected = 1;
        int output = insertPosition.searchInsert(nums, target);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] nums = {1,3,5,6};
        int target = 7;
        int expected = 4;
        int output = insertPosition.searchInsert(nums, target);
        assertEquals(expected, output);
    }


}