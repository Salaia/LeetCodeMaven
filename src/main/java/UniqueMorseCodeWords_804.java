import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords_804 {
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1) return 1;
        String[] alphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
                ".--", "-..-", "-.--", "--.."};

        Set<String> transformations = new HashSet<>();
        for (String currentWord : words) {
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < currentWord.length(); j++) {
                int letterCode = currentWord.charAt(j) - 97;
                builder.append(alphabet[letterCode]);
            }
            transformations.add(builder.toString());
        }

        return transformations.size();
    }
}
