public class ReplaceDigits_1844 {

    public String replaceDigits(String s) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < s.length(); i += 2) {
            char ch = (char) (s.charAt(i-1) + Integer.parseInt(String.valueOf(s.charAt(i))));
            builder.append(s.charAt(i-1)).append(ch);
        }
        if(builder.length() != s.length()) builder.append(s.charAt(s.length()-1));
        return builder.toString();
    }
}
