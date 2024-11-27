import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.
 *
 * For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 * Return the minimum possible sum of new1 and new2.
 */

public class MinimumSum_2160 {

    public int minimumSum(int n) {
        int[] a = new int[4];
        int i = 0;
        while (n > 0) {
            a[i] = n % 10;
            n /= 10;
            i++;
        }
        Arrays.sort(a);
        int x = (a[0] * 10) + a[2]; // даже если нули - все равно ок будет
        int y = (a[1] * 10) + a[3];
        return x + y;
    }
}
