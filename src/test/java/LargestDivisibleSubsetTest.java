import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestDivisibleSubsetTest {

    LargestDivisibleSubset lds = new LargestDivisibleSubset();

    @Test
    public void Test1() {
        int[] input = new int[]{1, 2, 3};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);

        List<Integer> output = lds.largestDivisibleSubset(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = new int[]{1, 2, 4, 8};
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(8);

        List<Integer> output = lds.largestDivisibleSubset(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = new int[]{3, 17};
        List<Integer> expected = new ArrayList<>();
        expected.add(3);

        List<Integer> output = lds.largestDivisibleSubset(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = new int[]{3, 4, 16, 8};
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(8);
        expected.add(16);

        List<Integer> output = lds.largestDivisibleSubset(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[] input = new int[]{4, 8, 10, 240};
        List<Integer> expected = new ArrayList<>();
        expected.add(4);
        expected.add(8);
        expected.add(240);

        List<Integer> output = lds.largestDivisibleSubset(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        int[] input = new int[]{2, 3, 4, 9, 8};
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(8);

        List<Integer> output = lds.largestDivisibleSubset(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test26() { // нумерация по Литкоду
        int[] input = new int[]{5, 9, 18, 54, 108, 540, 90, 180, 360, 720};
        List<Integer> expected = Arrays.asList(9, 18, 90, 180, 360, 720);

        List<Integer> output = lds.largestDivisibleSubset(input);
        assertEquals(expected, output);
    }
}