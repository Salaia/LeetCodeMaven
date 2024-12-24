import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveParentheses_1021Test {

    RemoveParentheses_1021 rp = new RemoveParentheses_1021();

    @Test
    public void Test1() {
        String input = "(()())(())";
        String expected = "()()()";
        String output = rp.removeOuterParentheses(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "(()())(())(()(()))";
        String expected = "()()()()(())";
        String output = rp.removeOuterParentheses(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "()()";
        String expected = "";
        String output = rp.removeOuterParentheses(input);
        assertEquals(expected, output);
    }

}