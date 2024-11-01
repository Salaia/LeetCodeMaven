import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[]{1, 0};
            }
            digits[0]++;
            return digits;
        }

        for (int i = digits.length - 1; i > -1; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                if (i != 0) {
                    digits[i] = 0;
                } else {
                    int[] result = new int[digits.length + 1];
                    result[0] = 1;
                    return result;
                }
            }
        }

        return digits;
    }
}
