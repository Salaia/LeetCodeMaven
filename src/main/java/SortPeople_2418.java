import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortPeople_2418 {

    public String[] sortPeople(String[] names, int[] heights) {

        int[] orderHeights = Arrays.copyOf(heights, heights.length);
        Arrays.sort(orderHeights);

        Map<Integer, Integer> indexes = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            indexes.put(heights[i], i);
        }

        String[] result = new String[names.length];
        int resultIndex = 0;
        for (int i = orderHeights.length-1; i >= 0; i--) {
            result[resultIndex] = names[indexes.get(orderHeights[i])];
            resultIndex++;
        }

        return result;
    }
}
