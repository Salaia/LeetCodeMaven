public class DIStringMatch_942 {

    // n = s.length, so if s == "DI" n is 2 and
    // perm is 0, 1, 2 in order by rules

    public int[] diStringMatch(String s) {
        int[] permutation = new int[s.length() + 1];
        int smallIndex = 0;
        int bigIndex = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                permutation[i] = smallIndex;
                smallIndex++;
            } else if (s.charAt(i) == 'D') {
                permutation[i] = bigIndex;
                bigIndex--;
            }
        }
        permutation[s.length()] = bigIndex;
        return permutation;
    }
}
