import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NumberOfEmployeesWhoMetTarget_2798Test {

    NumberOfEmployeesWhoMetTarget_2798 mt = new NumberOfEmployeesWhoMetTarget_2798();

    @Test
    public void Test1() {
        int[] hours = {0,1,2,3,4};
        int target = 2;
        int expected = 3;
        int output = mt.numberOfEmployeesWhoMetTarget(hours, target);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] hours = {5,1,4,2,2};
        int target = 6;
        int expected = 0;
        int output = mt.numberOfEmployeesWhoMetTarget(hours, target);
        assertEquals(expected, output);
    }

}