public class LastWordLength {
    public int lengthOfLastWord(String s) {
        if (s.isBlank()) return 0;

        int end = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                if (end == -1) {
                    end = i;
                }
            } else if (end != -1) {
                return end - i;
            }
        }
        return s.trim().length();
    }
}
