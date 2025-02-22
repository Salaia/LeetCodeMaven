import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountStrings_1684Test {

    CountStrings_1684 cs = new CountStrings_1684();

    @Test
    public void Test1() {
        String allowed = "ab";
        String[] words = {"ad","bd","aaab","baa","badab"};
        int expected = 2;
        int output = cs.countConsistentStrings(allowed, words);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String allowed = "abc";
        String[] words = {"a","b","c","ab","ac","bc","abc"};
        int expected = 7;
        int output = cs.countConsistentStrings(allowed, words);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};
        int expected = 4;
        int output = cs.countConsistentStrings(allowed, words);
        assertEquals(expected, output);
    }

}