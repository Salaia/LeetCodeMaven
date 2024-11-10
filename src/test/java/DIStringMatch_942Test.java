import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DIStringMatch_942Test {

    DIStringMatch_942 dsm = new DIStringMatch_942();

    @Test
    public void Test1() {
        String input = "IDID";
        int[] expected = {0,4,1,3,2};
        int[] output = dsm.diStringMatch(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "III";
        int[] expected = {0,1,2,3};
        int[] output = dsm.diStringMatch(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "DDI";
        int[] expected = {3,2,0,1};
        int[] output = dsm.diStringMatch(input);
        assertArrayEquals(expected, output);
    }

}