import java.util.HashMap;

/**
 * Given an integer array nums and an integer k,
 * return true if there are two distinct indices i and j in the array such that
 * nums[i] == nums[j] and abs(i - j) <= k.
 * <p>
 * Ох...
 * - Меня интересуют 2 индекса с равными значениями на определенном расстоянии друг от друга
 * - То есть весь массив проходить не обязательно. Достаточно найти нужную пару.
 * - Значит полный словарь данных отметаем
 * <p>
 * А как тогда хранить? И надо ли хранить данные... есть число, и количество шагов, в рамках которых
 * мы ищем. Не нашли - идем дальше. Нашли - return true. Закончился массив - return false.
 *
 * Вариант из решения оказался через мапу.
 * О чем я не подумала - это что k может быть очень большим.
 * По итогу складывать в мапу значение+индекс и заглядывать в нее с вопросом было ли такое значение
 * и какая разница по индексу с текущим дубликатом - намного быстрее.
 * Мы 1 раз проходим по массиву и максимум на каждый шаг заглядываем в мапу.
 * То есть 1+1. А если искать по самому массиву в рамках k-шагов, то это вплоть до квадратички
 */

public class ContainsDuplicateII_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]) && Math.abs(i - map.get(nums[i]))<=k)
            {
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }
}


/* Работает, но очень долго
if (k == 0 || nums.length == 1) return false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j <= k; j++) {
                if (i + j < nums.length && nums[i] == nums[i + j]) {
                    return true;
                }
            }

        }
        return false;
 */
