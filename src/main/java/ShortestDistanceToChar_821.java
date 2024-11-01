import java.util.ArrayList;
import java.util.List;

public class ShortestDistanceToChar_821 {
    public int[] shortestToChar(String s, char c) {

        int[] result = new int[s.length()];
        List<Integer> indexes = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                indexes.add(i);
                result[i] = -1;
            }
        }

        int prevC = -1;
        int nextIndex = 0;
        int nextC = indexes.get(nextIndex);
        for (int i = 0; i < result.length; i++) {
            if (result[i] == -1) {
                result[i] = 0;
                prevC = i;
                if (nextIndex != indexes.size() - 1) {
                    nextIndex++;
                    nextC = indexes.get(nextIndex);
                }
            } else if (prevC == -1) {
                result[i] = nextC - i;
            } else {
                result[i] = Math.abs(Math.min(nextC - i, i - prevC));
            }

        }
        return result;
    }
}
