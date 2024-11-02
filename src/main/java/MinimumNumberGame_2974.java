import java.util.Arrays;

public class MinimumNumberGame_2974 {

    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int tmp = 0;
        for (int i = 0; i < nums.length; i += 2) {
            tmp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = tmp;
        }
        return nums;
    }
}

/*
        Arrays.sort(nums);
        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int i = 1; i < nums.length; i += 2) {
            result[resultIndex] = nums[i];
            resultIndex++;
            result[resultIndex] = nums[i - 1];
            resultIndex++;
        }
        return result;
 */
