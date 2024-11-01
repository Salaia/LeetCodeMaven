import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseVowels_345Test {

    ReverseVowels_345 rv = new ReverseVowels_345();

    @Test
    public void Test1() {
        String input = "hello";
        String expected = "holle";
        String output = rv.reverseVowels(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "leetcode";
        String expected = "leotcede";
        String output = rv.reverseVowels(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "race car";
        String expected = "race car";
        String output = rv.reverseVowels(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String input = "Yo! Bottoms Up, u.S. Motto, boy!";
        String expected = "Yo! Bottoms up, U.S. Motto, boy!";
        String output = rv.reverseVowels(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        String input = "Aa";
        String expected = "aA";
        String output = rv.reverseVowels(input);
        assertEquals(expected, output);
    }

}