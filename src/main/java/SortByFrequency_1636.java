import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    Чет вообще голова не варит.
    Ну ок мапа с частотностью, но я же не могу ее отсортировать, да еще и значения
    Могу переложить в Map<Frequency, List<Integer>>, параллельно заполняя список частотностей для сортировки
    После чего из отсортированной частотности берешь, с этим идешь во вторую мапу...
    Чет сложно слишком.

    Посмотрела решение: там еще сложнее. Пойду переписывать.
    Переписала... не факт, что мое решение было сложным )))
    Но с компаратором явно ближе к тому, что хотел автор задачи (судя по подсказкам)
 */

public class SortByFrequency_1636 {

    public int[] frequencySort(int[] nums) {
        // Сделали мапу с частотностью
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Переложили входящий массив из примитивов в обертки, чтобы можно было использовать
        // кастомный компаратор
        Integer[] numsBoxed = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(numsBoxed, (a, b) -> {
            int freA = frequencyMap.get(a);
            int freB = frequencyMap.get(b);
            if (freA != freB) {
                // расставляем по возрастающей частотности
                return Integer.compare(freA, freB);
            } else {
                // если у чисел одинаковая частотность, то их нужно расставить в убывающем порядке
                return Integer.compare(b, a);
            }
        });

        // обратно распаковываем обертки в примитивы
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numsBoxed[i];
        }

        return nums;
    }
}
