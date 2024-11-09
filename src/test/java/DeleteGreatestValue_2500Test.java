import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteGreatestValue_2500Test {

    DeleteGreatestValue_2500 dgv = new DeleteGreatestValue_2500();

    @Test
    public void Test1() {
        int[][] grid = {{1,2,4},{3,3,1}};
        int expected = 8;
        int output = dgv.deleteGreatestValue(grid);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[][] grid = {{10}};
        int expected = 10;
        int output = dgv.deleteGreatestValue(grid);
        assertEquals(expected, output);
    }

}