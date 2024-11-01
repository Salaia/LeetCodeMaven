import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortPeople_2418Test {

    SortPeople_2418 sp = new SortPeople_2418();

    @Test
    public void Test1() {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};
        String[] expected = {"Mary","Emma","John"};
        String[] output = sp.sortPeople(names, heights);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        String[] names = {"Alice","Bob","Bob"};
        int[] heights = {155,185,150};
        String[] expected = {"Bob","Alice","Bob"};
        String[] output = sp.sortPeople(names, heights);
        assertArrayEquals(expected, output);
    }

}