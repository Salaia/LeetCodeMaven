public class IslandPerimeter_463 {

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    // сверху
                    if (i != 0 && grid[i - 1][j] == 1) {
                        perimeter--;
                        // снизу
                    }
                    if (i != grid.length - 1 && grid[i + 1][j] == 1) {
                        perimeter--;
                        // слева
                    }
                    if (j != 0 && grid[i][j - 1] == 1) {
                        perimeter--;
                        // справа
                    }
                    if (j != grid[i].length - 1 && grid[i][j + 1] == 1) {
                        perimeter--;
                    }
                }
            }
        }
        return perimeter;
    }
}
