import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleTest {

    PascalTriangle pascalTriangle = new PascalTriangle();

    @Test
    public void Test1() {
        int input = 5;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            result.add(new ArrayList<>());
        }
        result.get(0).addAll(List.of(1));
        result.get(1).addAll(List.of(1,1));
        result.get(2).addAll(List.of(1,2,1));
        result.get(3).addAll(List.of(1,3,3,1));
        result.get(4).addAll(List.of(1,4,6,4,1));

        List<List<Integer>> output = pascalTriangle.generate(input);
        assertEquals(result, output);
    }

    @Test
    public void Test2() {
        int input = 1;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            result.add(new ArrayList<>());
        }
        result.get(0).addAll(List.of(1));

        List<List<Integer>> output = pascalTriangle.generate(input);
        assertEquals(result, output);
    }

}