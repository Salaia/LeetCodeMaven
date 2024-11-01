/**
 * Подстава была в том, что в тест-кейсе 1 раз создается объект NumArray,
 * а потом огромное число раз вызывается sumRange.
 * Поэтому выгоднее в создании объекта посчитать суммы всех префикс-сумм до текущего индекса,
 * а в методе вычесть из готовой префикс-суммы правого индекса такую эе готовую сумму под левый индекс
 *
 */

public class RangeSumQuery_303 {

    static class NumArray {

        int[] nums;

        // Constructor
        public NumArray(int[] nums) {
            this.nums = nums;
        }

        public int sumRange(int left, int right) {
            int result = 0;
            for (int i = left; i <= right; i++) {
                result += nums[i];
            }
            return result;
        }

        public int testMe(int[] nums, int left, int right) {
            NumArray na = new NumArray(nums);
            return na.sumRange(left, right);
        }

        /*int[] sums;
        public NumArray(int[] nums) {
            int currentSum=0;
            int n=nums.length;
            sums=new int[n+1];

            for(int i=0;i<n;i++){
                currentSum+=nums[i];
                sums[i+1]=currentSum;
            }
        }

        public int sumRange(int left, int right) {
            return sums[right+1]-sums[left];
        }*/
    }
}
