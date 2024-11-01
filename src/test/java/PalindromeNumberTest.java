import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    PalindromeNumber pn = new PalindromeNumber();

    @Test
    public void test1() {
        int x = 121;
        assertTrue(pn.isPalindrome(x));
    }

    @Test
    public void test2() {
        int x = -121;
        assertFalse(pn.isPalindrome(x));
    }
}