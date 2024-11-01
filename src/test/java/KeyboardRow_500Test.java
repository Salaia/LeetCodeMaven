import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeyboardRow_500Test {

    KeyboardRow_500 kr = new KeyboardRow_500();

    @Test
    public void Test1() {
        String[] input = {"Hello","Alaska","Dad","Peace"};
        String[] expected = {"Alaska","Dad"};
        String[] output = kr.findWords(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        String[] input = {"omk"};
        String[] expected = {};
        String[] output = kr.findWords(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        String[] input = {"adsdf","sfd"};
        String[] expected = {"adsdf","sfd"};
        String[] output = kr.findWords(input);
        assertArrayEquals(expected, output);
    }

}