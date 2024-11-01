import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddBinary_67Test {

    AddBinary_67 ab = new AddBinary_67();

    @Test
    public void Test1() {
        String input1 = "11";
        String input2 = "1";
        String output = ab.addBinary(input1, input2);
        String expected = "100";
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input1 = "1010";
        String input2 = "1011";
        String output = ab.addBinary(input1, input2);
        String expected = "10101";
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input1 = "10010";
        String input2 = "1100";
        String output = ab.addBinary(input1, input2);
        String expected = "11110";
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        String input1 = "1011101";
        String input2 = "1000000";
        String output = ab.addBinary(input1, input2);
        String expected = "10011101";
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        String input1 = "10011";
        String input2 = "1111101";
        String output = ab.addBinary(input1, input2);
        String expected = "10010000";
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        String input1 = "10011001";
        String input2 = "100111";
        String output = ab.addBinary(input1, input2);
        String expected = "11000000";
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        String input1 = "11000011";
        String input2 = "101111";
        String output = ab.addBinary(input1, input2);
        String expected = "11110010";
        assertEquals(expected, output);
    }

    @Test
    public void Test8() {
        String input1 = "1001100";
        String input2 = "1100101";
        String output = ab.addBinary(input1, input2);
        String expected = "10110001";
        assertEquals(expected, output);
    }

    @Test
    public void Test9() {
        String input1 = "1001100";
        String input2 = "";
        String output = ab.addBinary(input1, input2);
        String expected = "1001100";
        assertEquals(expected, output);
    }
}