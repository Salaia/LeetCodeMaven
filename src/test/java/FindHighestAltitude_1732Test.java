import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindHighestAltitude_1732Test {

    FindHighestAltitude_1732 fh = new FindHighestAltitude_1732();

    @Test
    public void Test1() {
        int[] input = {-5,1,5,0,-7};
        int expected = 1;
        int output = fh.largestAltitude(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {-4,-3,-2,-1,4,3,2};
        int expected = 0;
        int output = fh.largestAltitude(input);
        assertEquals(expected, output);
    }

}