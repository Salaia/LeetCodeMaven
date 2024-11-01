public class MinElementAfterReplace_3300 {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            int sum = 0;
            for (int ch = 0; ch < str.length(); ch++) {
                sum += str.charAt(ch) - '0';
            }
            nums[i] = sum;
            min = Math.min(sum, min);
        }
        return min;
    }
}
