import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicatesTest {

    ContainsDuplicates containsDuplicates = new ContainsDuplicates();

    @Test
    public void Test1() {
        int[] input = {1,2,3,1};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] input = {1,2,3,4};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = false;
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test4() {
        int[] input = {3,3};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test5() {
        int[] input = {3};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = false;
        assertEquals(expected, output);
    }

    @Test
    public void Test6() {
        int[] input = {};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = false;
        assertEquals(expected, output);
    }

    @Test
    public void Test7() {
        int[] input = {0,4,5,0,3,6};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test8() {
        int[] input = {5, 3, 5, 2, 1, 6, 6, 4};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test9() {
        int[] input = {5, 35,5};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = true;
        assertEquals(expected, output);
    }

    @Test
    public void Test10() {
        int[] input = {7,10,5,5,6,6,4,10,5,4,9,4,9,6,5,9,6,3,6,5,6,7,7,4,9,9,10,5,8,1,8,3,2,7,5,10,1,8,5,8,4,3,6,4,9,4,2,8,3,2,2,1,5,6,3,2,6,1,8,6,2,9,1,4,5,10,8,5,10,5,10,1,4,8,3,6,4,10,9,1,1,1,2,2,9,6,6,8,1,9,2,5,5,2,1,8,5,2,3,10};
        boolean output = containsDuplicates.containsDuplicate(input);
        boolean expected = true;
        assertEquals(expected, output);
    }
}