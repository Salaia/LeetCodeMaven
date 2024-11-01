import java.util.HashSet;
import java.util.Set;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = 0;
        Set<Integer> distinct = new HashSet<>();
        for (Integer i : nums){
            sum += i;
            distinct.add(i);
        }
        int multi = 0;
        for (Integer i : distinct){
            multi += i;
        }
        return multi*2 - sum;
    }
}
/*
11ms
import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int sum = 0;
        int distinct = 0;
        Set<Integer> single = new HashSet<>();
        for (Integer i : nums){
            sum += i;
            if (single.remove(i)){
                distinct +=i;
            }
            single.add(i);
        }

        return sum - distinct*2;
    }
}*/


/*import java.util.*;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Set<Integer> single = new HashSet<>();
        for (Integer i : nums){
            if (single.contains(i)){
                single.remove(i);
            } else single.add(i);
        }
        return single.stream().findAny().get();
    }
}*/

/*import java.util.Arrays;
        import java.util.HashMap;
        import java.util.Map;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Map<Integer, Integer> counter = new HashMap<>();
        for (Integer i : nums) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }

       *//* for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }*//*
        for (Integer i : counter.keySet()) {
            if (counter.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }
}*/

/*
Решение с Литкода через побитовое ИЛИ

int result=0;
        for(int i=0; i<nums.length; i++) {
            result = result^nums[i];
        }
        return result;
 */

/*
Мое первое решение

if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                i++;
            } else {
                return nums[i];
            }
        }

        return nums[nums.length-1];
 */