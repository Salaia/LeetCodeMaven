public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].isEmpty()) {
            return "";
        }

        StringBuilder prefix = new StringBuilder();

        int shortestLength = strs[0].length();

        for (String s : strs) {
            if (s.length() < shortestLength) {
                shortestLength = s.length();
            }
        }

        char tmpCh = strs[0].charAt(0);
        for (int i = 0; i < shortestLength; i++) {
            boolean isOk = true;
            for (String str : strs) {
                if (tmpCh != str.charAt(i)) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) {
                prefix.append(tmpCh);
            } else {
                return prefix.toString();
            }
            if (i < shortestLength - 1) {
                tmpCh = strs[0].charAt(i + 1);
            }
        }

        return prefix.toString();
    }
}