/*
The recursive solution uses the concept of Fibonacci numbers to solve the problem.
! Мапа создается один раз, и ссылка на нее передается в приватный метод для рекурсии

Зарываемся в рекурсию, пока от нашей лестницы не останется 0 или 1 ступеней
(с ними можно справиться 1 способом - это число и возвращаем)
Заметь: рекурсия в форме дерева, расходится на 2 варианта каждый раз

Записываем в мапу, для скольки ступенек посчитали число способов.
 */

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs_70_Fibonacci {

    public int climbStairs(int n) {
        // без этой мапы переполняет память
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }}
