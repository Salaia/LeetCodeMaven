import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SummaryRanges_228Test {

    SummaryRanges_228 sr = new SummaryRanges_228();

    @Test
    public void Test1() {
        int[] input = {0,1,2,4,5,7};
        List<String> expected = List.of("0->2","4->5","7");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {0,2,3,4,6,8,9};
        List<String> expected = List.of("0","2->4","6","8->9");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {-2147483648,-2147483647,2147483647};
        List<String> expected = List.of("-2147483648->-2147483647","2147483647");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = {0,2,3};
        List<String> expected = List.of("0", "2->3");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[] input = {0,1,3};
        List<String> expected = List.of("0->1", "3");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test6() {
        int[] input = {};
        List<String> expected = new ArrayList<>();
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test7() {
        int[] input = {-1};
        List<String> expected = List.of("-1");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test8() {
        int[] input = {-5,-4,-2,-1,0,1,2};
        List<String> expected = List.of("-5->-4", "-2->2");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test9() {
        int[] input = {0, 2, 3, 4, 5, 6, 7, 8, 10, 20, 25, 26, 27};
        List<String> expected = List.of("0", "2->8", "10", "20", "25->27");
        List<String> output = sr.summaryRanges(input);
        assertIterableEquals(expected, output);
    }

}