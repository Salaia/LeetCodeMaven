import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class CountNumberOfPairs_2006Test {

    CountNumberOfPairs_2006 cn = new CountNumberOfPairs_2006();

    @Test
    public void Test1() {
        int[] input = {1,2,2,1};
        int k = 1;
        int expected = 4;
        int output = cn.countKDifference(input, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,3};
        int k = 3;
        int expected = 0;
        int output = cn.countKDifference(input, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {3,2,1,5,4};
        int k = 2;
        int expected = 3;
        int output = cn.countKDifference(input, k);
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = {9,3,1,1,4,5,4,9,5,10};
        int k = 1;
        int expected = 8;
        int output = cn.countKDifference(input, k);
        assertEquals(expected, output);
    }
}