import java.util.HashSet;
import java.util.Set;

public class SneakyNumbers_3289 {

    public int[] getSneakyNumbers(int[] nums) {
        int[] result = new int[2];
        int index = 0;
        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!uniques.add(nums[i])) {
                result[index] = nums[i];
                index++;
                if (index == 2) {
                    return result;
                }
            }
        }
        return result;
    }
}
