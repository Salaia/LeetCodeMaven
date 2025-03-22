public class TransformArray_3467 {

    public int[] transformArray(int[] nums) {
        int[] result = new int[nums.length];
        int zeroes = 0;
        int ones = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                result[zeroes] = 0;
                zeroes++;
            } else {
                result[ones] = 1;
                ones--;
            }
        }
        return result;
    }
}
