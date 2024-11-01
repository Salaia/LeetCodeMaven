import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindIndexFirstInStringTest {

    FindIndexFirstInString find = new FindIndexFirstInString();

    @Test
    public void Test1() {
        String haystack = "sadbutsad";
        String needle = "sad";
        int expected = 0;
        int output = find.strStr(haystack, needle);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String haystack = "leetcode";
        String needle = "leeto";
        int expected = -1;
        int output = find.strStr(haystack, needle);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String haystack = "mississippi";
        String needle = "issip";
        int expected = 4;
        int output = find.strStr(haystack, needle);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String haystack = "";
        String needle = "";
        int expected = 0;
        int output = find.strStr(haystack, needle);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        String haystack = "a";
        String needle = "";
        int expected = 0;
        int output = find.strStr(haystack, needle);
        assertEquals(expected, output);
    }


}