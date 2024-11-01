import java.util.*;

/**
 *  Теперь задача вернуть определенный ряд из треугольника Паскаля
 *  Простой путь: взять решение первой задачи, вернуть из полного треугольника искомый ряд
 *  Сложный: не держать в памяти весь треугольник, а переписывать предыдущий ряд,
 *  пока не получишь искомый
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> currentRow = new ArrayList<>();
        currentRow.add(1);
        if (rowIndex == 0) {
            return currentRow;
        }

        List<Integer> prevRow;
        for (int i = 1; i <= rowIndex; i++) {
            prevRow = currentRow;
            currentRow = new ArrayList<>();

            currentRow.add(1);
            for (int j = 0; j < i-1; j++) {
                currentRow.add(prevRow.get(j) + prevRow.get(j+1));
            }
            currentRow.add(1);

            if (i == rowIndex) {
                return currentRow;
            }
        }
        return currentRow;
    }
}
