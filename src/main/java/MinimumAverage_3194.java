import java.util.Arrays;

public class MinimumAverage_3194 {

    public double minimumAverage(int[] nums) {
        int tail = nums.length - 1;
        int mid = nums.length / 2;
        double minAverage = Double.MAX_VALUE;
        //double[] averages = new double[mid];

        Arrays.sort(nums);
        for (int i = 0; i < mid; i++) {
            double average = (double) (nums[i] + nums[tail - i]) / 2;
            minAverage = Math.min(minAverage, average);
            //averages[i] = average;
        }

        return minAverage;
    }
}
