import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AlterGroups_3206Test {

    AlterGroups_3206 ag = new AlterGroups_3206();

    @Test
    public void Test1() {
        int[] input = {1,1,1};
        int output = ag.numberOfAlternatingGroups(input);
        int expected = 0;
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {0,1,0,0,1};
        int output = ag.numberOfAlternatingGroups(input);
        int expected = 3;
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1,0,0};
        int output = ag.numberOfAlternatingGroups(input);
        int expected = 1;
        assertEquals(expected, output);
    }

}