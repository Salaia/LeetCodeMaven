import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountPairs_2824Test {

    CountPairs_2824 cp = new CountPairs_2824();

    @Test
    public void Test1() {
        List<Integer> input = List.of(-1, 1, 2, 3, 1);
        int target = 2;
        int expected = 3;
        int output = cp.countPairs(input, target);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        List<Integer> input = List.of(-6, 2, 5, -2, -7, -1, 3);
        int target = -2;
        int expected = 10;
        int output = cp.countPairs(input, target);
        assertEquals(expected, output);
    }

}