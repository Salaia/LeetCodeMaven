import java.util.*;

public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>(i+1));
            List<Integer> current = result.get(i);
            current.add(1);
            if (i > 1) {
                for (int j = 0; j < i - 1; j++) {
                    List<Integer> prev = result.get(i-1);
                    current.add(prev.get(j) + prev.get(j+1));
                }
            }
            if (i > 0) {
                current.add(1);
            }
        }

        return result;
    }
}
