import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {

    ValidParentheses vp = new ValidParentheses();

    @Test
    public void Test1() {
        String input = "()";
        assertTrue(vp.isValid(input));
    }

    @Test
    public void Test2() {
        String input = "()[]{}";
        assertTrue(vp.isValid(input));
    }

    @Test
    public void Test3() {
        String input = "(]";
        assertFalse(vp.isValid(input));
    }

    @Test
    public void Test65() {
        String input = "{[]}";
        assertTrue(vp.isValid(input));
    }

    @Test
    public void Test77() {
        String input = "([)]";
        assertFalse(vp.isValid(input));
    }

    @Test
    public void Test82() {
        String input = "([]";
        assertFalse(vp.isValid(input));
    }

}