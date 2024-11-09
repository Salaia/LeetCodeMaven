import java.util.Arrays;

public class DeleteGreatestValue_2500 {

    public int deleteGreatestValue(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            Arrays.sort(grid[i]);
        }

        int counter = 0;
        int row = grid[0].length-1;
        while (row>=0) {
            int currentMax = grid[0][row];
            for (int i = 1; i < grid.length; i++) {
                currentMax = Math.max(currentMax, grid[i][row]);
            }
            counter += currentMax;
            row--;
        }

        return counter;
    }
}
