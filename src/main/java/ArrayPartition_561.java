import java.util.Arrays;

public class ArrayPartition_561 {
    public int arrayPairSum(int[] nums) {
// Это мое
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}

// Солюшн... мне б его хоть прочитать и осознать, что они навертели

/*
class Solution {
    public int arrayPairSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int[] counts = new int[max - min + 1];
        for (int num : nums) {
            counts[num - min]++;
        }
        int res = 0;
        int idx = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            while (counts[idx] == 0) {
                idx++;
            }
            res += idx;
            counts[idx]--;
            while (counts[idx] == 0) {
                idx++;
            }
            counts[idx]--;
        }
        return res + nums.length / 2 * min;
    }
}
 */