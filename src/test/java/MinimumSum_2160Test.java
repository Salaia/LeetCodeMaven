import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSum_2160Test {

    MinimumSum_2160 ms = new MinimumSum_2160();

    @Test
    public void Test1() {
        int input = 2932;
        int expected = 52;
        int output = ms.minimumSum(input);
        assertEquals(expected, output);
    }

}