import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BaseballGame_682Test {

    BaseballGame_682 bg = new BaseballGame_682();

    @Test
    public void Test1() {
        String[] input = {"5","2","C","D","+"};
        int expected = 30;
        int output = bg.calPoints(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String[] input = {"5","-2","4","C","D","9","+","+"};
        int expected = 27;
        int output = bg.calPoints(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String[] input = {"1","C"};
        int expected = 0;
        int output = bg.calPoints(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String[] input = {"-60","D","-36","30","13","C","C","-33","53","79"};
        int expected = -117;
        int output = bg.calPoints(input);
        assertEquals(expected, output);
    }

}