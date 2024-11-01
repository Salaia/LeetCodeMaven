public class ShuffleArray_1470 {

    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int resultIndex = 0;
        for (int i = 0; i < n; i++) {
            result[resultIndex] = nums[i];
            resultIndex++;
            result[resultIndex] = nums[i+n];
            resultIndex++;
        }
        return result;
    }
}
