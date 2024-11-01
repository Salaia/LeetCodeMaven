public class SplitStringBalanced_1221 {

    public int balancedStringSplit(String s) {
        int result = 0;
        int rCount = 0;
        int lCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                rCount++;
            } else if (s.charAt(i) == 'L') {
                lCount++;
            }

            if (rCount != 0 && rCount == lCount) {
                result++;
                rCount = 0;
                lCount = 0;
            }
        }

        return result;
    }
}
