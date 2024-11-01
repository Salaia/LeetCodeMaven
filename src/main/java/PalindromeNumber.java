public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reverse = 0;
        int loopInt = x;
        int tail = 0;

        while (loopInt != 0) {
            tail = loopInt % 10;
            reverse = reverse * 10 + tail;
            loopInt /= 10;
        }

        return (reverse == x);
    }
}

/*
String inputStr = String.valueOf(x);
        String reverseStr = new StringBuilder(inputStr).reverse().toString();
        return inputStr.equals(reverseStr);
 */