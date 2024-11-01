public class LeftRightSum_2574 {
    public int[] leftRightDifference(int[] nums) {
        int[] answer = new int[nums.length];
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];

        // left
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1];
        }

        //right
        for (int i = nums.length - 2; i >= 0; i--) {
            rightSum[i] = rightSum[i + 1] + nums[i + 1];
        }

        // sum difference
        for (int i = 0; i < answer.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;

    }
}
