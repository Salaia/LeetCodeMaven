public class SortArrayByParity_905 {
    public int[] sortArrayByParity(int[] nums) {
        if (nums.length == 1) return nums;
        int[] result = new int[nums.length];
        int head = 0;
        int tail = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                result[head] = num;
                head++;
            } else {
                result[tail] = num;
                tail--;
            }
        }
        return result;
    }
}
