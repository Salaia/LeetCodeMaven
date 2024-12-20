public class MinimumOperationsToDivByThree_3190 {
    public int minimumOperations(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (num % 3 != 0) {
                result++; // если цифра не делится на 3, то у нее справа или слева есть нужный сосед
            }
        }
        return result;
    }
}
