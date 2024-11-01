import java.util.HashSet;
import java.util.Set;

public class TwoArraysIntersection_349 {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> result = new HashSet<>();
        Set<Integer> checker = new HashSet<>();

        for (int num : nums1) {
            checker.add(num);
        }
        for (int num : nums2) {
            if (checker.contains(num)) {
                result.add(num);
            }
        }

        int[] convertedResult = new int[result.size()];
        int index = 0;
        for(Integer num: result) {
            convertedResult[index] = num;
            index++;
        }

        return convertedResult;
    }
}
