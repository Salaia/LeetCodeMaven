import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<>();
        List<List<Integer>> subsets = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            Integer checkNum = nums[i];
            List<Integer> createLine = new ArrayList<>();
            createLine.add(checkNum);
            subsets.add(createLine);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer checkNum = nums[i];

            if (subsets.isEmpty()) {
                List<Integer> outcast = new ArrayList<>();
                outcast.add(checkNum);
                subsets.add(outcast);
            } else {
                boolean isSomeOk = false;

                for (int s = 0; s < subsets.size(); s++) {
                    //for (List<Integer> loopSub : subsets) {
                    List<Integer> loopSub = subsets.get(s);
                    boolean isLoopOk = true;
                    List<Integer> loopSubCopy = new ArrayList<>(loopSub);

                    for (int o = 0; o < loopSubCopy.size() && isLoopOk; o++) {
                        int old = loopSubCopy.get(o);
                        if (old % checkNum == 0 ||
                                checkNum % old == 0) {
                            isLoopOk = true;
                        } else isLoopOk = false;
                    }

                    if (isLoopOk && !loopSub.contains(checkNum)) {
                        loopSub.add(checkNum);
                        isSomeOk = true;
                    }
                }
                //if (!isSomeOk) {
                //}

            }
        }

        int maxLength = 0;
        int resultIndex = 0;
        System.out.println(subsets);
        for (int i = 0; i < subsets.size(); i++) {
            if (subsets.get(i).size() > maxLength) {
                maxLength = subsets.get(i).size();
                resultIndex = i;
            }
        }
        result = subsets.get(resultIndex);

        Collections.sort(result);
        return result;
    }
}

/*
 *   Так блэт.
 *   По имени метода судя, нужно вернуть самый длинный сабсет взаимоделимых чисел.
 * Значит, в ходе задачи мне нужно создать их ряд. Как мне... это бесконечно огромный пипец.
 *
 * Создать двухмерный массив, по длине массива входящего
 * Брать элемент из входящего массива
 * Проверять его на взаимоделимость с каждым элементом входящего
 * и добавлять всех, кто подошел (1 пойдет во все подмассивы)
 * Если никто не подошел - остается один
 *
 * В конце надо сравнить длины подмассивов и вернуть самый длинный
 * (сначала его отсортировать)
 *  */


/*
    Arrays.sort(nums);

        if (nums.length == 0) {
            return result;
        }
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (nums[i] % nums[j] == 0 ||
                        nums[j] % nums[i] == 0) {
                    if (result.isEmpty()) {
                        result.add(nums[i]);
                        result.add(nums[j]);
                    } else {
                        if (!result.contains(nums[i])) {
                            result.add(nums[i]);
                                    }
                                    if (!result.contains(nums[j])) {
                                    result.add(nums[j]);
                                    }
                                    }
                                    i--;
                                    }
                                    }
                                    }
                                    if (result.size() == 0) {
                                    int random = (int) (Math.random() * nums.length);
                                    result.add(nums[random]);
                                    return result;
                                    }
 */