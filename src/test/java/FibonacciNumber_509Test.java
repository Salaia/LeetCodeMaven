import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumber_509Test {

    FibonacciNumber_509 fn = new FibonacciNumber_509();

    @Test
    public void Test1() {
        int input = 2;
        int expected = 1;
        int output = fn.fib(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int input = 3;
        int expected = 2;
        int output = fn.fib(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int input = 4;
        int expected = 3;
        int output = fn.fib(input);
        assertEquals(expected, output);
    }

}