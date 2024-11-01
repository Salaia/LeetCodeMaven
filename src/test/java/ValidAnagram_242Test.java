import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidAnagram_242Test {

    ValidAnagram_242 va = new ValidAnagram_242();

    @Test
    public void Test1() {
        String s = "anagram";
        String t = "nagaram";
        boolean output = va.isAnagram(s, t);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String s = "rat";
        String t = "car";
        boolean output = va.isAnagram(s, t);
        boolean expected = false;
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String s = "ab";
        String t = "a";
        boolean output = va.isAnagram(s, t);
        boolean expected = false;
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String s = "a";
        String t = "a";
        boolean output = va.isAnagram(s, t);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        String s = "aa";
        String t = "aa";
        boolean output = va.isAnagram(s, t);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        String s = "a";
        String t = "b";
        boolean output = va.isAnagram(s, t);
        boolean expected = false;
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        String s = "a";
        String t = "ab";
        boolean output = va.isAnagram(s, t);
        boolean expected = false;
        assertEquals(expected, output);
    }

}