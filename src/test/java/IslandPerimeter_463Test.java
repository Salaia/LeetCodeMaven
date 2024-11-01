import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IslandPerimeter_463Test {

    IslandPerimeter_463 ip = new IslandPerimeter_463();

    @Test
    public void Test1() {
        int[][] grid = {{1}};
        int expected = 4;
        int output = ip.islandPerimeter(grid);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[][] grid = {{1, 0}};
        int expected = 4;
        int output = ip.islandPerimeter(grid);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int expected = 16;
        int output = ip.islandPerimeter(grid);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[][] grid = {{1,1,1},{1,0,1}};
        int expected = 12;
        int output = ip.islandPerimeter(grid);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[][] grid = {{1,1},{1,1}};
        int expected = 8;
        int output = ip.islandPerimeter(grid);
        assertEquals(expected, output);
    }
}