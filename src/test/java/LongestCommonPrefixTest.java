import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    LongestCommonPrefix lcp = new LongestCommonPrefix();

    @Test
    public void Test1() {
        String[] input = {"flower","flow","flight"};
        String expected = "fl";
        String output = lcp.longestCommonPrefix(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String[] input = {""};
        String expected = "";
        String output = lcp.longestCommonPrefix(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String[] input = {"a"};
        String expected = "a";
        String output = lcp.longestCommonPrefix(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        String[] input = {"ab", "a"};
        String expected = "a";
        String output = lcp.longestCommonPrefix(input);
        assertEquals(expected, output);
    }

}