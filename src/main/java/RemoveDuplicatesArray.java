import java.util.Arrays;

public class RemoveDuplicatesArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int[] numsIterator = Arrays.copyOf(nums, nums.length);
        int indexInsert = 1;
        for (int i = 0; i < nums.length - 2; i++) {
            if (numsIterator[i] != numsIterator[i + 1]) {
                nums[indexInsert] = numsIterator[i + 1];
                indexInsert++;
            }
        }
        if (numsIterator[nums.length-2] != numsIterator[nums.length-1]) {
            nums[indexInsert] = numsIterator[nums.length - 1];
            indexInsert++;
        }

        if (indexInsert == 1) return indexInsert;
        return indexInsert;
    }
}

/*
Самый залайканый солюшен
Лучше моего тем, что я сравниваю левый с правым, а надо было правый с левым.
Из-за этого у меня криво с length-2, вне основного цикла последнее сравнение
Мое решение примерно такое же по скорости и памяти, но намного хуже читается
Вообще странно, что по памяти почти так же - у меня же делается копия массива для итерирования,
что делает мой код в 2 раза тяжелее по памяти.
Видимо, тесты такое не учитывают.

int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
 */


/*
Мое первое, изъебистое решение.
Работает, но явно медленно (3мс против 1мс в других решениях)

Set<Integer> unique = new LinkedHashSet<>();
        for (Integer i : nums) {
            unique.add(i);
        }
        int index = 0;
        for (Integer i : unique) {
            nums[index] = i;
            index++;
        }
        return unique.size();
 */