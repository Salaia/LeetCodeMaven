import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmallestPalindrome_2697Test {

    SmallestPalindrome_2697 sp = new SmallestPalindrome_2697();

    @Test
    public void Test1() {
        String input = "egcfe";
        String expected = "efcfe";
        String output = sp.makeSmallestPalindrome(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "abcd";
        String expected = "abba";
        String output = sp.makeSmallestPalindrome(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "seven";
        String expected = "neven";
        String output = sp.makeSmallestPalindrome(input);
        assertEquals(expected, output);
    }

}