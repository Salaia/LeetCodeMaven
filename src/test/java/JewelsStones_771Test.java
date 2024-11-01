import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JewelsStones_771Test {

    JewelsStones_771 js = new JewelsStones_771();

    @Test
    public void Test1() {
        String jewels = "aA";
        String stones = "aAAbbbb";
        int expected = 3;
        int output = js.numJewelsInStones(jewels, stones);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String jewels = "z";
        String stones = "ZZ";
        int expected = 0;
        int output = js.numJewelsInStones(jewels, stones);
        assertEquals(expected, output);
    }

}