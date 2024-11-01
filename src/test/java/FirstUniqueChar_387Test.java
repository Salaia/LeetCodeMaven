import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FirstUniqueChar_387Test {
    FirstUniqueChar_387 fu = new FirstUniqueChar_387();

    @Test
    public void Test1() {
    String input = "leetcode";
    int expected = 0;
    int output = fu.firstUniqChar(input);
    assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "loveleetcode";
        int expected = 2;
        int output = fu.firstUniqChar(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "aabb";
        int expected = -1;
        int output = fu.firstUniqChar(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String input = "dddccdbba";
        int expected = 8;
        int output = fu.firstUniqChar(input);
        assertEquals(expected, output);
    }
}