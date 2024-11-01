import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CountOfMatches_1688Test {

    CountOfMatches_1688 cm = new CountOfMatches_1688();

    @Test
    public void Test1() {
        int input = 7;
        int expected = 6;
        int output = cm.numberOfMatches(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int input = 14;
        int expected = 13;
        int output = cm.numberOfMatches(input);
        assertEquals(expected, output);
    }

}