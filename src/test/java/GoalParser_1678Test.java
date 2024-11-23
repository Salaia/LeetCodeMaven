import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoalParser_1678Test {

    GoalParser_1678 gp = new GoalParser_1678();

    @Test
    public void Test1(){
        String input = "G()(al)";
        String expected = "Goal";
        String output = gp.interpret(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2(){
        String input = "(al)G(al)()()G";
        String expected = "alGalooG";
        String output = gp.interpret(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3(){
        String input = "G()()()()(al)";
        String expected = "Gooooal";
        String output = gp.interpret(input);
        assertEquals(expected, output);
    }

}