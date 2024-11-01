import java.util.Arrays;

public class ThirdMax_414 {

    public int thirdMax(int[] nums) {
        if (nums.length == 1) return nums[0];

        Arrays.sort(nums);
        int max = nums[nums.length-1];
        int firstMax = nums[nums.length-1];
        int counter = 1;

        for (int i = nums.length-2; i >= 0 ; i--) {
            if(nums[i] != nums[i+1]) {
                max = nums[i];
                counter++;
                if (counter == 3) {
                    return max;
                }
            }
        }

        return firstMax;

    }
}

/*
class Solution {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = max1;
        int max3 = max1;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n == Integer.MIN_VALUE) {
                flag = true;
            }
            if (n > max1) {
                max3 = max2;
                max2 = max1;
                max1 = n;
            } else {
                if (n > max2 && n != max1) {
                    max3 = max2;
                    max2 = n;
                } else {
                    if (n > max3 && n != max2 && n != max1) {
                        max3 = n;
                    }
                }
            }
        }
        if (nums.length <= 2 || max3 == Integer.MIN_VALUE && !flag ||
            max3 == Integer.MIN_VALUE && flag && max2 == Integer.MIN_VALUE) {
            return max1;
        }
        if (max3 == Integer.MIN_VALUE && flag) {
            return max3;
        }
        return max3;
    }
}
 */