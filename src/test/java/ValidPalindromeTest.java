import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ValidPalindromeTest {
    ValidPalindrome validPalindrome = new ValidPalindrome();

    @Test
    public void Test1() {
    String input = "A man, a plan, a canal: Panama";
    boolean output = validPalindrome.isPalindrome(input);
    assertTrue(output);
    }

    @Test
    public void Test2() {
        String input = "race a car";
        boolean output = validPalindrome.isPalindrome(input);
        assertFalse(output);
    }


    @Test
    public void Test3() {
        String input = " ";
        boolean output = validPalindrome.isPalindrome(input);
        assertTrue(output);
    }

    @Test
    public void Test463() {
        String input = "0P";
        boolean output = validPalindrome.isPalindrome(input);
        assertFalse(output);
    }

}