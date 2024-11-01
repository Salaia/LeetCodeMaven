import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalTriangleIITest {

    PascalTriangleII pascalTriangleII = new PascalTriangleII();

    @Test
    public void Test1() {
        int rowIndex = 3;
        List<Integer> expected = List.of(1,3,3,1);
        List<Integer> output = pascalTriangleII.getRow(rowIndex);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int rowIndex = 0;
        List<Integer> expected = List.of(1);
        List<Integer> output = pascalTriangleII.getRow(rowIndex);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int rowIndex = 1;
        List<Integer> expected = List.of(1,1);
        List<Integer> output = pascalTriangleII.getRow(rowIndex);
        assertEquals(expected, output);
    }

}