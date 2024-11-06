import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfWords_2114Test {

    MaximumNumberOfWords_2114 mn = new MaximumNumberOfWords_2114();

    @Test
    public void Test1() {
        String[] input = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int expected = 6;
        int output = mn.mostWordsFound(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String[] input = {"please wait", "continue to fight", "continue to win"};
        int expected = 3;
        int output = mn.mostWordsFound(input);
        assertEquals(expected, output);
    }


}