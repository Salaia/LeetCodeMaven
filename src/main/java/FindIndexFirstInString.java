/**
 * #28
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * <p>
 * build-in haystack.indexOf(needle) does that, but it's not what you'll need at interview
 * <p>
 * People say it's KMP search (Knuth-Morris-Pratt)
 * in Java: https://www.youtube.com/watch?v=EL4ZbRF587g
 */
public class FindIndexFirstInString {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        if (haystack.length() < needle.length()) return -1;

        int[] lps = new int[needle.length()];
        int prefix = 0;
        for (int i = 1; i < needle.length(); i++) {
            while (prefix > 0 && needle.charAt(i) != needle.charAt(prefix)) {
                prefix = lps[prefix - 1];
            }
            if (needle.charAt(i) == needle.charAt(prefix)) {
                prefix++;
                lps[i] = prefix;
            }
        }

        int needleIndex = 0;
        for (int h = 0; h < haystack.length(); h++) {
            while (needleIndex > 0 && needle.charAt(needleIndex) != haystack.charAt(h)) {
                needleIndex = lps[needleIndex - 1];
            }
            if (needle.charAt(needleIndex) == haystack.charAt(h)) {
                needleIndex++;
            }
            if (needleIndex == needle.length()) {
                return h - needleIndex + 1;
            }
        }


        return -1;
    }
}
