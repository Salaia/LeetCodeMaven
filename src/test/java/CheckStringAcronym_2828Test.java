import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckStringAcronym_2828Test {

    CheckStringAcronym_2828 cs = new CheckStringAcronym_2828();

    @Test
    public void Test1() {
        List<String> words = List.of("alice","bob","charlie");
        String s = "abc";
        boolean expected = true;
        boolean output = cs.isAcronym(words, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        List<String> words = List.of("an","apple");
        String s = "a";
        boolean expected = false;
        boolean output = cs.isAcronym(words, s);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        List<String> words = List.of("never","gonna","give","up","on","you");
        String s = "ngguoy";
        boolean expected = true;
        boolean output = cs.isAcronym(words, s);
        assertEquals(expected, output);
    }
}