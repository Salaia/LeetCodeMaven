import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTheSentence_1859Test {

    SortingTheSentence_1859 ss = new SortingTheSentence_1859();

    @Test
    public void Test1() {
        String input = "is2 sentence4 This1 a3";
        String expected = "This is a sentence";
        String output = ss.sortSentence(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String input = "Myself2 Me1 I4 and3";
        String expected = "Me Myself and I";
        String output = ss.sortSentence(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String input = "Yw1 PUx2";
        String expected = "Yw PUx";
        String output = ss.sortSentence(input);
        assertEquals(expected, output);
    }
}