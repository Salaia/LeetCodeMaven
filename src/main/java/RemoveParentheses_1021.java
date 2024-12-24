import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class RemoveParentheses_1021 {

    public String removeOuterParentheses(String s) {
        StringBuilder validStrings = new StringBuilder();
        int startIndex = 0;
        int open = 0;
        int closed = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                open++;
            } else {
                closed++;
                if (open == closed && open != 0) {
                    validStrings.append(s, startIndex+1, i);
                    startIndex = i+1;
                }
            }
        }
        return validStrings.toString();
    }
}
