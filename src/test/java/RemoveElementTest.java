import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RemoveElementTest {

    RemoveElement re = new RemoveElement();

    @Test
    public void Test1() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = re.removeElement(nums, val);
        assertEquals(result, 5);
    }

    @Test
    public void Test88() {
        int[] nums = {3, 3};
        int val = 3;
        int result = re.removeElement(nums, val);
        assertEquals(0, result);
    }

}