import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoArraysIntersectionII_350 {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> counter1 = new HashMap<>();
        Map<Integer, Integer> counter2 = new HashMap<>();

        for (int n : nums1) {
            counter1.put(n, counter1.getOrDefault(n, 0) + 1);
        }

        for (int n : nums2) {
            counter2.put(n, counter2.getOrDefault(n, 0) + 1);
        }

        List<Integer> preResult = new ArrayList<>();
        for (Integer n: counter1.keySet()) {
            if (counter2.containsKey(n)) {
                int min = Math.min(counter1.get(n), counter2.get(n));
                while (min != 0) {
                    preResult.add(n);
                    min--;
                }
            }
        }

        int[] result = new int[preResult.size()];
        int index = 0;
        for(Integer n : preResult) {
            result[index] = n;
            index++;
        }

        return  result;
    }
}
