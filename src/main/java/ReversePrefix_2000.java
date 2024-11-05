public class ReversePrefix_2000 {
    public String reversePrefix(String word, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch) {
                StringBuilder builder = new StringBuilder();
                builder.append(word.substring(0, i+1));
                builder.reverse();
                String result = builder + word.substring(i+1, word.length());
                return result;
            }
        }
        return word;
    }
}
