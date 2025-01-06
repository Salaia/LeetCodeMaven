public class ToLowerCase_709 {
    public String toLowerCase(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if (c <= 'Z' && c >= 'A') {
                builder.append((char)('a' +(c-'A')));
            } else {
                builder.append((char)c);
            }
        }
        return builder.toString();
    }
}
