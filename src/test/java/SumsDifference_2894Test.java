import org.junit.jupiter.api.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.jupiter.api.Assertions.*;

class SumsDifference_2894Test {

    SumsDifference_2894 sd = new SumsDifference_2894();

    @Test
    public void Test1() {
        int n = 10;
        int m = 3;
        int expected = 19;
        int output = sd.differenceOfSums(n,m);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int n = 5;
        int m = 6;
        int expected = 15;
        int output = sd.differenceOfSums(n,m);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int n = 5;
        int m = 1;
        int expected = -15;
        int output = sd.differenceOfSums(n,m);
        assertEquals(expected, output);
    }
}