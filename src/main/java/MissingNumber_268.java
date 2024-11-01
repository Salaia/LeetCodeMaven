/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 *
 * Единственное, они не отсортированы.
 */

public class MissingNumber_268 {

    public int missingNumber(int[] nums) {
        int naturalSum = nums.length * (nums.length + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return naturalSum - actualSum;
    }

}

/*   Самое быстрое решение - через математическую формулу

        int n = nums.length;
        int expectedSum = n * (n + 1) / 2; // Сумма натуральных чисел
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
 */

/*
    // Плохой вариант - идти по всему массиву по порядку, пока не найдем, но работает
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return nums.length;
 */


/*
            Если nums[i] == i, то слева все хорошо, ищем справа
            если nums[i] > i, то пропуск слева

            Вопрос только как проверять, что мы нашли пропуск?
             */