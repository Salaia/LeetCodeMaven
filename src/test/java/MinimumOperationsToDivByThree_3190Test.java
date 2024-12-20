import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumOperationsToDivByThree_3190Test {

    MinimumOperationsToDivByThree_3190 mo = new MinimumOperationsToDivByThree_3190();

    @Test
    public void Test1() {
        int[] input = {1,2,3,4};
        int expected = 3;
        int output = mo.minimumOperations(input);
        assertEquals(expected, output);
    }

}