import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountItems_1773Test {

    CountItems_1773 ci = new CountItems_1773();

    @Test
    public void Test1() {
        List<List<String>> input = List.of(List.of("phone","blue","pixel"),
                List.of("computer","silver","lenovo"), List.of("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        int expected = 1;
        int output = ci.countMatches(input, ruleKey, ruleValue);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        List<List<String>> input = List.of(List.of("phone","blue","pixel"),
                List.of("computer","silver","phone"), List.of("phone","gold","iphone"));
        String ruleKey = "type";
        String ruleValue = "phone";
        int expected = 2;
        int output = ci.countMatches(input, ruleKey, ruleValue);
        assertEquals(expected, output);
    }

}