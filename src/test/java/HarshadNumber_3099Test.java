import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HarshadNumber_3099Test {

    HarshadNumber_3099 hn = new HarshadNumber_3099();

    @Test
    public void Test1() {
        int input = 18;
        int expected = 9;
        int output = hn.sumOfTheDigitsOfHarshadNumber(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int input = 23;
        int expected = -1;
        int output = hn.sumOfTheDigitsOfHarshadNumber(input);
        assertEquals(expected, output);
    }

}