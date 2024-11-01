import java.util.HashMap;
import java.util.Map;

public class NextGreaterElementI_496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums1.length == 1 && nums2.length == 1) {
            int[] result = new int[1];
            result[0] = -1;
            return result;
        }

        // key = num2 VALUE, value = num2 INDEX
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(nums2[i], i);
        }

        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            for (int j = map.get(current) + 1; j < nums2.length; j++) {
                if (nums2[j] > current) {
                    result[i] = nums2[j];
                    break;
                }
            }
            if (result[i] == 0) {
                result[i] = -1;
            }
        }
        return result;
    }
}
