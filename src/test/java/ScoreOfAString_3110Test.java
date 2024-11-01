import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreOfAString_3110Test {

    ScoreOfAString_3110 sc = new ScoreOfAString_3110();

    @Test
    public void Test1() {
        String input = "zaz";
        int output = 50;
        int expected = sc.scoreOfString(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "hello";
        int output = 13;
        int expected = sc.scoreOfString(input);
        assertEquals(expected, output);
    }
}