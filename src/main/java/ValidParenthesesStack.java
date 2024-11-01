import java.util.Stack;

public class ValidParenthesesStack {
        public boolean isValid(String s) {
            Stack<Character> brackets = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[' || c == '{') {
                    brackets.push(c);
                } else {
                    if (brackets.isEmpty()) {
                        return false;
                    }
                    char top = brackets.peek();
                    if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                        brackets.pop();
                    } else {
                        return false;
                    }
                }
            }
            return brackets.isEmpty();
        }

}

/*
public boolean isValid(String s) {
            // Create an empty brackets to keep track of opening brackets
            Stack<Character> brackets = new Stack<Character>();

            // Loop through every character in the string
            for (char c : s.toCharArray()) {
                // If the character is an opening bracket, push it onto the brackets
                if (c == '(' || c == '[' || c == '{') {
                    brackets.push(c);
                } else { // If the character is a closing bracket
                    // If the brackets is empty, there is no matching opening bracket, so return false
                    if (brackets.isEmpty()) {
                        return false;
                    }
                    // Otherwise, get the top of the brackets and check if it's the matching opening bracket
                    char top = brackets.peek();
                    if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                        // If it is, pop the opening bracket from the brackets
                        brackets.pop();
                    } else { // Otherwise, the brackets don't match, so return false
                        return false;
                    }
                }
            }
            // If the brackets is empty, all opening brackets have been closed, so return true
            // Otherwise, there are unmatched opening brackets, so return false
            return brackets.isEmpty();
        }
 */
