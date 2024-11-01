import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ClimbingStairs_70_FibonacciTest {

    ClimbingStairs_70_Fibonacci cs = new ClimbingStairs_70_Fibonacci();

    @Test
    public void Test1() {
        int input = 4;
        int output = cs.climbStairs(input);
        int expected = 5;
        assertEquals(expected, output);
    }

}