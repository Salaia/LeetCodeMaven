public class SortingTheSentence_1859 {

    public String sortSentence(String s) {
        String[] reorder = new String[10];
        int start = 0;
        //int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                reorder[s.charAt(i - 1) - '0'] = s.substring(start, i - 1);
                start = i + 1;
                //counter++;
            }
        }
        reorder[s.charAt(s.length()-1) - '0'] = s.substring(start, s.length() - 1);

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < reorder.length; i++) {
            if (reorder[i] != null) {
                builder.append(reorder[i]).append(' ');
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}
