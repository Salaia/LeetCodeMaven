import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.isEmpty()) {
            return false;
        }

        // indexes of last open brackets
        List<Integer> roundIndex = new ArrayList<>();
        List<Integer> curlIndex = new ArrayList<>();
        List<Integer> squareIndex = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ((i == s.length() - 1) &&
                    (ch == '(' || ch == '{' || ch == '[')) {
                    return false;
            }

            // OPEN
            if (ch == '(') {
                roundIndex.add(i);
            }
            if (ch == '{') {
                curlIndex.add(i);
            }
            if (ch == '[') {
                squareIndex.add(i);
            }

            // CLOSE
            if (ch == ')' && (roundIndex.isEmpty() ||
                    (!squareIndex.isEmpty() && roundIndex.get(roundIndex.size()-1) < squareIndex.get(squareIndex.size()-1)) ||
                    (!curlIndex.isEmpty() && roundIndex.get(roundIndex.size()-1) < curlIndex.get(curlIndex.size()-1)))) {
                return false;
            } else if (ch == ')') {
                roundIndex.remove(roundIndex.size()-1);
            }

            if (ch == '}' && (curlIndex.isEmpty() ||
                    (!squareIndex.isEmpty() && curlIndex.get(curlIndex.size()-1) < squareIndex.get(squareIndex.size()-1)) ||
                    (!roundIndex.isEmpty() && curlIndex.get(curlIndex.size()-1) < roundIndex.get(roundIndex.size()-1)))) {
                return false;
            } else if (ch == '}') {
                curlIndex.remove(curlIndex.size()-1);
            }

            if (ch == ']' && (squareIndex.isEmpty() ||
                    (!curlIndex.isEmpty() && squareIndex.get(squareIndex.size()-1) < curlIndex.get(curlIndex.size()-1)) ||
                    (!roundIndex.isEmpty() && squareIndex.get(squareIndex.size()-1) < roundIndex.get(roundIndex.size()-1)))) {
                return false;
            } else if (ch == ']') {
                squareIndex.remove(squareIndex.size()-1);
            }
        }

        if (!curlIndex.isEmpty() || !roundIndex.isEmpty() || !squareIndex.isEmpty()) {
            return false;
        }
        return true;
    }
}