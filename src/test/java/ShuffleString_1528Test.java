import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShuffleString_1528Test {

    ShuffleString_1528 ss = new ShuffleString_1528();

    @Test
    public void Test1() {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        String expected = "leetcode";
        String output = ss.restoreString(s, indices);
        assertEquals(expected, output);
    }

}