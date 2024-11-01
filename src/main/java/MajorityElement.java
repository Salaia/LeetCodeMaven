import java.util.Arrays;

public class MajorityElement {
    /**
     *  Какой-то элемент должен занимать больше половины входящего массива
     *
     *  Путь простой: берем мапу, идем по массиву и перекладываем, увеличивая счетчик
     *  Когда счетчик становится равен половина+1, возвращаем этот элемент
     *  Но по дополнительному условию у меня должно быть линейное время выполнения
     *  и без дополнительной памяти
     *
     *  В стоковых примерах массив заполнен элементами двух типов. Но в условиях этого нет.
     */
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}

// Boyer–Moore majority vote algorithm

// f I have [1,1,1,2,2,2], why is 1 the majority number
// and not 2? - INVALID TESTCASE
