import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountGoodTriplets_1534Test {

    CountGoodTriplets_1534 cg = new CountGoodTriplets_1534();

    @Test
    public void Test1() {
        int[] input = {3, 0, 1, 1, 9, 7};
        int a = 7;
        int b = 2;
        int c = 3;
        int expected = 4;
        int output = cg.countGoodTriplets(input, a, b, c);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,1,2,2,3};
        int a = 0;
        int b = 0;
        int c = 1;
        int expected = 0;
        int output = cg.countGoodTriplets(input, a, b, c);
        assertEquals(expected, output);
    }

}