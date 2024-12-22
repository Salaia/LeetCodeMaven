import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodeMessage_2325Test {

    DecodeMessage_2325 dm = new DecodeMessage_2325();

    @Test
    public void Test1() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String expected = "this is a secret";
        String output = dm.decodeMessage(key, message);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String key = "eljuxhpwnyrdgtqkviszcfmabo";
        String message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb";
        String expected = "the five boxing wizards jump quickly";
        String output = dm.decodeMessage(key, message);
        assertEquals(expected, output);
    }

}