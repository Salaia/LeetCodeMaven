public class SumSubarrays_3427 {

    public int subarraySum(int[] nums) {
        int sum = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = Math.max(0, i - nums[i]); j <= i; j++) {
                current += nums[j];
            }
            sum += current;
            current = 0;
        }
        return sum;
    }
}
