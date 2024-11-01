import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WordPattern_290Test {

    WordPattern_290 wp = new WordPattern_290();

    @Test
    public void Test1() {
        String pattern = "abba";
        String s = "dog cat cat dog";
        boolean expected = true;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String pattern = "abba";
        String s = "dog cat cat fish";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String pattern = "ab";
        String s = "happy hacking";
        boolean expected = true;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        String pattern = "jquery";
        String s = "jquery";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        String pattern = "aa";
        String s = "dog dog dog dog";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        String pattern = "e";
        String s = "eureka";
        boolean expected = true;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test8() {
        String pattern = "abba";
        String s = "dog dog dog dog";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test9() {
        String pattern = "abba";
        String s = "dog cat dog";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test10() {
        String pattern = "abba";
        String s = "e";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test11() {
        String pattern = "abbc";
        String s = "dog dog cat mouse";
        boolean expected = false;
        boolean output = wp.wordPattern(pattern, s);
        assertEquals(expected, output);
    }
}