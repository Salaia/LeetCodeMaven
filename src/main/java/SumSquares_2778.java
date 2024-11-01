public class SumSquares_2778 {

    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) {
                result += (nums[i] * nums[i]);
            }
        }
        return result;
    }
}
