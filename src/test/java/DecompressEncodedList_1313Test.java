import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecompressEncodedList_1313Test {

    DecompressEncodedList_1313 dl = new DecompressEncodedList_1313();

    @Test
    public void Test1() {
        int[] input = {1,2,3,4};
        int[] expected = {2,4,4,4};
        int[] output = dl.decompressRLElist(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,1,2,3};
        int[] expected = {1,3,3};
        int[] output = dl.decompressRLElist(input);
        assertArrayEquals(expected, output);
    }

}