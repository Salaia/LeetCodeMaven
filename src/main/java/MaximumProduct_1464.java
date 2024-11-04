import java.util.Arrays;

/**
 *
 * Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 *
 *  Вообще по логике задачи нужно было брутфорсом пройти вложенным циклом.
 *  Но зачем, если значения в массиве от единицы, и даже за вычетом единицы
 *  в худшем случае оказываются нулем... в общем, я не могу никак получить минус
 */

public class MaximumProduct_1464 {
    public int maxProduct(int[] nums) {
        if (nums.length == 2) return (nums[0]-1)*(nums[1]-1);

        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
    }
}
