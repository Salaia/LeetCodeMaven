import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UniqueMorseCodeWords_804Test {

    UniqueMorseCodeWords_804 mc = new UniqueMorseCodeWords_804();

    @Test
    public void Test1(){
        String[] input = {"a"};
        int expected = 1;
        int output = mc.uniqueMorseRepresentations(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2(){
        String[] input = {"gin","zen","gig","msg"};
        int expected = 2;
        int output = mc.uniqueMorseRepresentations(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3(){
        String[] input = {"rwjje","aittjje","auyyn","lqtktn","lmjwn"};
        int expected = 1;
        int output = mc.uniqueMorseRepresentations(input);
        assertEquals(expected, output);
    }

}