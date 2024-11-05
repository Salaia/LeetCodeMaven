import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePrefix_2000Test {

    ReversePrefix_2000 rp = new ReversePrefix_2000();

    @Test
    public void Test1() {
        String word = "abcdefd";
        char ch = 'd';
        String expected = "dcbaefd";
        String output = rp.reversePrefix(word, ch);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String word = "xyxzxe";
        char ch = 'z';
        String expected = "zxyxxe";
        String output = rp.reversePrefix(word, ch);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String word = "abcd";
        char ch = 'z';
        String expected = "abcd";
        String output = rp.reversePrefix(word, ch);
        assertEquals(expected, output);
    }

}