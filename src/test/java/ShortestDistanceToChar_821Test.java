import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestDistanceToChar_821Test {

    ShortestDistanceToChar_821 sd = new ShortestDistanceToChar_821();

    @Test
    public void Test1() {
        String s = "loveleetcode";
        char c = 'e';
        int[] expected = {3,2,1,0,1,0,0,1,2,2,1,0};
        int[] output = sd.shortestToChar(s, c);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        String s = "aaab";
        char c = 'b';
        int[] expected = {3,2,1,0};
        int[] output = sd.shortestToChar(s, c);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        String s = "aaba";
        char c = 'b';
        int[] expected = {2,1,0,1};
        int[] output = sd.shortestToChar(s, c);
        assertArrayEquals(expected, output);
    }

}