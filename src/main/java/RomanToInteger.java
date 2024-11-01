public class RomanToInteger {
    public int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int result = 0;

        boolean isIncompleteDigit = true;
        int tmpDigit = 0;
        // I = 1, V = 5, X = 10, L = 50, C = 100, D = 500,M = 1000
        for (int i = 0; i < s.length(); i++) {
            char letter = chars[i];
            char nextLetter = 'A'; // нет такой римской цифры (вроде), так что это затычка
            if (i != s.length() - 1) {
                nextLetter = chars[i + 1];
            }

            if (letter == 'I' &&
                    (nextLetter != 'V' && nextLetter != 'X')) {
                //tmpDigit = 1;
                result += 1; // I
            }
            if (letter == 'I' && nextLetter == 'V') {
                result += 4; // IV
                i++;
            }
            if (letter == 'I' && nextLetter == 'X') {
                result += 9; // IX
                i++;
            }

            if (letter == 'V') {
                result += 5; // V
            }

            if (letter == 'X' &&
                    (nextLetter != 'L' && nextLetter != 'C')) {
                result += 10; // X
            }
            if (letter == 'X' && nextLetter == 'L') {
                result += 40; // XL
                i++;
            }
            if (letter == 'X' && nextLetter == 'C') {
                result += 90; // XC
                i++;
            }

            if (letter == 'L') {
                result += 50; // L
            }

            if (letter == 'C' &&
                    (nextLetter != 'D' && nextLetter != 'M')){
                result += 100; // C
            }
            if (letter =='C' && nextLetter == 'D') {
                result += 400; // CD
                i++;
            }
            if (letter == 'C' && nextLetter == 'M') {
                result += 900; // CM
                i++;
            }
            if (letter == 'D') {
                result += 500;
            }
            if (letter == 'M') {
                result += 1000;
            }
        }
        return result;
    }
}
