import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * DesignNeighborSum_3242
 * Вроде бы в аналогичной задаче делали матрицу сумм. Но, эм, тут-то мы делаем сумму из соседей,
 * а не из неограниченного числа проходов. Другой вопрос, что чтобы найти центральный элемент,
 * мне нужно пройти по всему массиву. Он, кстати, не запредельно большой.
 * Может, тогда мне нужна мапа?
 *
 * Хотя нет, по солюшену сделать массив сумм по значению из матрицы в качестве индекса - быстрее.
 * Но мне вот вообще не хочется это сюда даже копировать
 */

public class NeighborSum {

    Map<Integer, List<Integer>> keys = new HashMap<>();
    int[][] grid;

    public NeighborSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                keys.put(grid[i][j], List.of(i, j));
            }
        }
        this.grid = grid;
    }

    public int adjacentSum(int value) {
        int sum = 0;
        int row = keys.get(value).get(0);
        int column = keys.get(value).get(1);

        if (row != 0) {
            sum += grid[row - 1][column];
        }
        if (row != grid.length - 1) {
            sum += grid[row + 1][column];
        }
        if (column != 0) {
            sum += grid[row][column - 1];
        }
        if (column != grid[row].length - 1) {
            sum += grid[row][column + 1];
        }

        return sum;
    }

    public int diagonalSum(int value) {
        int sum = 0;
        int row = keys.get(value).get(0);
        int column = keys.get(value).get(1);

        if (row != 0) {
            if (column != 0) {
                sum += grid[row - 1][column - 1];
            }
            if (column != grid[row].length - 1) {
                sum += grid[row - 1][column + 1];
            }
        }
        if (row != grid.length - 1) {
            if (column != grid[row].length - 1) {
                sum += grid[row + 1][column + 1];
            }
            if (column != 0) {
                sum += grid[row + 1][column - 1];
            }
        }

        return sum;
    }

}
