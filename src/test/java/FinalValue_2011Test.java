import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinalValue_2011Test {

    FinalValue_2011 fv = new FinalValue_2011();

    @Test
    public void Test1() {
        String[] input = {"--X","X++","X++"};
        int expected = 1;
        int output = fv.finalValueAfterOperations(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String[] input = {"++X","++X","X++"};
        int expected = 3;
        int output = fv.finalValueAfterOperations(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String[] input = {"X++","++X","--X","X--"};
        int expected = 0;
        int output = fv.finalValueAfterOperations(input);
        assertEquals(expected, output);
    }

}