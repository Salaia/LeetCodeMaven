import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IsomorphicStrings_205Test {

    IsomorphicStrings_205 is = new IsomorphicStrings_205();

    @Test
    public void Test1() {
        String s = "egg";
        String t = "add";
        boolean expected = true;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String s = "foo";
        String t = "bar";
        boolean expected = false;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String s = "paper";
        String t = "title";
        boolean expected = true;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String s = "a";
        String t = "a";
        boolean expected = true;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        String s = "-";
        String t = "0";
        boolean expected = true;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        String s = "12";
        String t = "\u0067\u0067";
        boolean expected = false;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        String s = "bbbaaaba";
        String t = "aaabbbba";
        boolean expected = false;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test8() {
        String s = "badc";
        String t = "baba";
        boolean expected = false;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }

    @Test
    public void Test9() {
        String s = "ab";
        String t = "ca";
        boolean expected = true;
        boolean output = is.isIsomorphic(s,t);
        assertEquals(expected, output);
    }
}