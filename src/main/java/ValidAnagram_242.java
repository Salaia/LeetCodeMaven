import java.util.*;

public class ValidAnagram_242 {
    public boolean isAnagram(String s, String t) {
        if (t.length() != s.length()) {
            return false;
        }

        Map<Character, Integer> letters = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            letters.put(t.charAt(i), letters.getOrDefault(t.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (!letters.containsKey(ch)) {
                return false;
            } else {
                int count = letters.get(ch) - 1;
                if (count == 0) {
                    letters.remove(ch);
                } else {
                    letters.put(ch, count);
                }
            }
        }

        return true;
    }
}
