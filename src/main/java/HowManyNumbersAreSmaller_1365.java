import java.util.Arrays;

public class HowManyNumbersAreSmaller_1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        int[] sort = new int[nums.length];
        System.arraycopy(nums, 0, sort, 0, nums.length);
        Arrays.sort(sort);
        for (int i = 0; i < nums.length; i++) {
            boolean isFound = false;
            int current = nums[i];
            for (int j = sort.length - 1; j >= 0; j--) {
                if (isFound && sort[j] < current) {
                    result[i] = j + 1;
                    break;
                }
                if (sort[j] == current) {
                    isFound = true;
                }
            }
        }
        return result;
    }
}
