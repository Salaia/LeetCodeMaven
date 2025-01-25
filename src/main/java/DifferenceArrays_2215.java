import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceArrays_2215 {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        result.add(new ArrayList<>());

        Set<Integer> unique1 = new HashSet<>();
        for (int k : nums1) {
            unique1.add(k);
        }
        Set<Integer> unique2 = new HashSet<>();
        for (int j : nums2) {
            unique2.add(j);
        }

        for(Integer current: unique1) {
            if (!unique2.contains(current)) {
                result.get(0).add(current);
            }
        }
        for(Integer current: unique2) {
            if (!unique1.contains(current)) {
                result.get(1).add(current);
            }
        }
        return result;
    }
}
