import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KidsWithCandies_1431Test {

    KidsWithCandies_1431 kc = new KidsWithCandies_1431();

    @Test
    public void Test1() {
        int[] candies = {2,3,5,1,3};
        int extra = 3;
        List<Boolean> expected = List.of(true,true,true,false,true);
        List<Boolean> output = kc.kidsWithCandies(candies, extra);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] candies = {4,2,1,1,2};
        int extra = 1;
        List<Boolean> expected = List.of(true,false,false,false,false);
        List<Boolean> output = kc.kidsWithCandies(candies, extra);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] candies = {12,1,12};
        int extra = 10;
        List<Boolean> expected = List.of(true,false,true);
        List<Boolean> output = kc.kidsWithCandies(candies, extra);
        assertIterableEquals(expected, output);
    }

}