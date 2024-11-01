import java.util.Arrays;

public class ArrayConcatenation_1929 {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] answer = new int[numsLength * 2];
        for (int i = 0; i < numsLength; i++) {
            answer[i] = nums[i];
            answer[numsLength + i] = nums[i];
        }
        //Arrays.stream(answer).forEach(System.out::println);
        return answer;
    }
}

/**  Solution через   System.arraycopy пишут быстрее даже
 *
 * int l = nums.length;
 *         int[] ans = new int[2 * l];
 *         System.arraycopy(nums, 0, ans, 0, l);
 *         System.arraycopy(nums, 0, ans, l, l);
 *         nums = null; // to remove initial array for space complexity.
 *         return ans;
 */