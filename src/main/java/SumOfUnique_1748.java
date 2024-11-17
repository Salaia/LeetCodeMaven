import java.util.HashMap;
import java.util.Map;

public class SumOfUnique_1748 {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> checker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            checker.put(nums[i], checker.getOrDefault(nums[i], 0) + 1);
        }
        for (Integer i : checker.keySet()) {
            if (checker.get(i) == 1) sum += i;
        }
        return sum;
    }
}

/* Вот опять: жамкаешь на code sample за 0 мс, траишь, а там та же скорость, как и у меня
int res = 0;
        int[] freq = new int[101];
        for (int n : nums) {
            if (++freq[n] == 1) {
                res += n;
            } else if (freq[n] == 2) {
                res -= n;
            }
        }
        return res;
 */