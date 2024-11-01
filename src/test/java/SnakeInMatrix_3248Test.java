import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SnakeInMatrix_3248Test {

    SnakeInMatrix_3248 sm = new SnakeInMatrix_3248();

    @Test
    public void Test1() {
        int n = 2;
        List<String> commands = new ArrayList<>(List.of("RIGHT","DOWN"));
        int expected = 3;
        int output = sm.finalPositionOfSnake(n, commands);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int n = 3;
        List<String> commands = new ArrayList<>(List.of("DOWN","RIGHT","UP"));
        int expected = 1;
        int output = sm.finalPositionOfSnake(n, commands);
        assertEquals(expected, output);
    }

}