import java.util.List;

public class SnakeInMatrix_3248 {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int current = 0;

        for (String c : commands) {
            switch (c) {
                case "UP" -> current -= n;
                case "DOWN" -> current += n;
                case "RIGHT" -> current++;
                case "LEFT" -> current--;
            }

        }
        return current;
    }

}
