import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesArrayTest {

    RemoveDuplicatesArray rd = new RemoveDuplicatesArray();

    @Test
    public void Test1() {
        int[] input = {1,1,2};
        rd.removeDuplicates(input);
    }

    @Test
    public void Test2() {
        int[] input = {0,0,1,1,1,2,2,3,3,4};
        rd.removeDuplicates(input);
    }

    @Test
    public void Test3() {
        int[] input = {1,1,1};
        rd.removeDuplicates(input);
    }

}