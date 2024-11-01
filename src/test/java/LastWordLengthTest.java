import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LastWordLengthTest {

    LastWordLength lastWordLength = new LastWordLength();

    @Test
    public void Test1() {
        String input = "Hello World";
        int output = lastWordLength.lengthOfLastWord(input);
        int expected = 5;
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "   fly me   to   the moon  ";
        int output = lastWordLength.lengthOfLastWord(input);
        int expected = 4;
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "luffy is still joyboy";
        int output = lastWordLength.lengthOfLastWord(input);
        int expected = 6;
        assertEquals(expected, output);
    }

    @Test
    public void Test57() {
        String input = "a ";
        int output = lastWordLength.lengthOfLastWord(input);
        int expected = 1;
        assertEquals(expected, output);
    }
}