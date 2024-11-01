import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitStringBalanced_1221Test {

    SplitStringBalanced_1221 sb = new SplitStringBalanced_1221();

    @Test
    public void Test1() {
        String input = "RLRRLLRLRL";
        int expected = 4;
        int output = sb.balancedStringSplit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "RLRRRLLRLL";
        int expected = 2;
        int output = sb.balancedStringSplit(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "LLLLRRRR";
        int expected = 1;
        int output = sb.balancedStringSplit(input);
        assertEquals(expected, output);
    }

}