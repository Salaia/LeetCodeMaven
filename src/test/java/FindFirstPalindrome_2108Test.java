import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindFirstPalindrome_2108Test {

    FindFirstPalindrome_2108 fp = new FindFirstPalindrome_2108();

    @Test
    public void Test1(){
        String[] input = {"abc","car","ada","racecar","cool"};
        String expected = "ada";
        String output = fp.firstPalindrome(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2(){
        String[] input = {"notapalindrome","racecar"};
        String expected = "racecar";
        String output = fp.firstPalindrome(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3(){
        String[] input = {"def","ghi"};
        String expected = "";
        String output = fp.firstPalindrome(input);
        assertEquals(expected, output);
    }

}