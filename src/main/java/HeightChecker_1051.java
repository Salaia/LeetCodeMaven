import java.util.Arrays;

public class HeightChecker_1051 {

    public int heightChecker(int[] heights) {
        int counter = 0;
        int[] sorted = new int[heights.length];
        System.arraycopy(heights, 0, sorted, 0, heights.length);
        Arrays.sort(sorted);
        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != sorted[i]) counter++;
        }

        return counter;
    }
}
