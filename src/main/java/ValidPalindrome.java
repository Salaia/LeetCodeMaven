/*
    Моя логика была в том, чтобы превратить строку в последовательность допустимых символов,
    потом развернуть и проверить, идентичны ли строки.
    Логика в самом залайканом солюшене другая:
    идем с разных концов строки и сравниваем посимвольно (игнорируя недопустимые символы)
    как только натыкаемся на несоответствие - выбрасываем false.
 */

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.trim();
        if (s.length() == 0) return true;

        s = s.toLowerCase();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') ||
                    (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
                builder.append(s.charAt(i));
            }
        }

        s = builder.toString();
        String reverse = builder.reverse().toString();
        return s.equals(reverse);
    }
}
