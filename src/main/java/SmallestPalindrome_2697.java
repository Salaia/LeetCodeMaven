public class SmallestPalindrome_2697 {

    public String makeSmallestPalindrome(String s) {
        char[] current = s.toCharArray();

        int tail = s.length() - 1;
        int middle = s.length()/2;
        for (int i = 0; i < middle; i++) {
            char headChar = current[i];
            char tailChar = current[tail-i];
            if (headChar != tailChar) {
                if (headChar < tailChar) {
                    current[tail-i] = headChar;
                } else {
                    current[i] = tailChar;
                }
            }
        }

        return String.valueOf(current);
    }
}
