public class CountOfMatches_1688 {

    public int numberOfMatches(int n) {
        if (n == 1) return 0;
        int matchesCount = 0;
        while (n > 1) {
            boolean isEven = n % 2 == 0;

            if (isEven) {
                n /= 2;
                matchesCount += n;
            } else {
                matchesCount += (n - 1) / 2;
                n = (n - 1) / 2 + 1;
            }
        }
        return matchesCount;
    }
}
