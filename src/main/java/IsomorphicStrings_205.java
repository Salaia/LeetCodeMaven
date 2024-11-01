import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s and t, determine if they are isomorphic.
 *
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 *
 * All occurrences of a character must be replaced with another character
 * while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 *
 * То есть задача на маску слова. У слов "egg" и "add" маска слова "122"
 */
public class IsomorphicStrings_205 {
    public boolean isIsomorphic(String s, String t) {
        int counter = 0;

        int[] sMask = new int[s.length()];
        Map<Character, Integer> sCheck = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!sCheck.containsKey(s.charAt(i))) {
                sCheck.put(s.charAt(i), counter);
                sMask[i] = counter;
                counter++;
            } else {
                sMask[i] = sCheck.get(s.charAt(i));
            }
        }

        counter = 0;
        int[] tMask = new int[t.length()];
        Map<Character, Integer> tCheck= new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if (!tCheck.containsKey(t.charAt(i))) {
                tCheck.put(t.charAt(i), counter);
                tMask[i] = counter;
                counter++;
            } else {
                tMask[i] = tCheck.get(t.charAt(i));
            }
        }

        return Arrays.equals(sMask, tMask);
    }
}
