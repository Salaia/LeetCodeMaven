import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoveZeroes_283Test {

    MoveZeroes_283 mz = new MoveZeroes_283();

    @Test
    public void Test1() {
        int[] input = {0,1,0,3,12};
        mz.moveZeroes(input);
    }

    @Test
    public void Test2() {
        int[] input = {0};
        mz.moveZeroes(input);
    }

    @Test
    public void Test3() {
        int[] input = {0, 0, 0, 0, 0, 0, 1};
        mz.moveZeroes(input);
    }

    @Test
    public void Test4() {
        int[] input = {45192,0,-659,-52359,-99225,-75991,0,-15155,27382,59818,0,-30645,-17025,81209,887,64648};
        mz.moveZeroes(input);
    }

    @Test
    public void Test5() {
        int[] input = {16601,78714,11653,-45162,0,-22859,0,36007,19143,-91750,0,-45361,-10715,46528,-91518,-36985,59578,76628,-87592,89803,0,-41430,44290,59831,41824,-30916,-6521,61614,46035,39346,0,0,32417};
        mz.moveZeroes(input);
    }

}