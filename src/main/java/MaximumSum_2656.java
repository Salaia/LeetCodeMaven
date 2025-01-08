import java.util.Arrays;

public class MaximumSum_2656 {

    public int maximizeSum(int[] nums, int k) {
        int score = 0;
        Arrays.sort(nums);
        int max = nums[nums.length - 1];
        while (k > 0) {
            k--;
            score += max;
            max += 1;
        }
        return score;
    }
}
