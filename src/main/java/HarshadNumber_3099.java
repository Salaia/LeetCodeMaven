public class HarshadNumber_3099 {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int current = x;
        int sum = 0;
        while (current > 0) {
            sum += current % 10;
            current /= 10;
        }
        if (x % sum == 0) {
            return sum;
        } else return -1;
    }
}
