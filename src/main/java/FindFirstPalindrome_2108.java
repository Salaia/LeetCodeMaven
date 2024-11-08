public class FindFirstPalindrome_2108 {

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            StringBuilder builder = new StringBuilder(word);
            builder.reverse();
            if (word.contentEquals(builder)) return word;
        }
        return "";
    }
}
