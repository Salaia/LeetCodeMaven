import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TruncateSentence_1816Test {

    TruncateSentence_1816 ts = new TruncateSentence_1816();

    @Test
    public void Test1() {
        String s = "Hello how are you Contestant";
        int k = 4;
        String expected = "Hello how are you";
        String output = ts.truncateSentence(s, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String s = "What is the solution to this problem";
        int k = 4;
        String expected = "What is the solution";
        String output = ts.truncateSentence(s, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String s = "chopper is not a tanuki";
        int k = 5;
        String expected = "chopper is not a tanuki";
        String output = ts.truncateSentence(s, k);
        assertEquals(expected, output);
    }

}