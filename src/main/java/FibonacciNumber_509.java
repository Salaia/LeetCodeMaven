public class FibonacciNumber_509 {
    /**
     * Задание, переводя на человеческий:
     * дан ИНДЕКС в последовательности Фибоначчи
     * нужно вернуть сумму двух предшествующих этому индексу значений
     * (эй, это же Фибоначчи, то есть надо вернуть значение по индексу n)
     * фиг с ним, уже засабмитила, и так топовая скорость
     */
    public int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int prev = 1;
        int prevPrev = 0;
        int sum = prevPrev + prev;

        for (int i = 2; i < n; i++) {
            prevPrev = prev;
            prev = sum;
            sum = prevPrev + prev;
        }

        return sum;
    }
}
