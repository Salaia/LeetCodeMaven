import java.util.*;

public class ContainsDuplicates {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }

        Set<Integer> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // 92% vs 70%(set.contains())
            if(!check.add(nums[i])) {
                return true; // set.add() возвращает false, если пытаешься положить в него то, что в нем уже есть
            }
        }

        return false;
    }
}

/*
  Via Set 70%
  faster, then Map... few less operations


  if (nums.length == 0 || nums.length == 1) {
            return false;
        }

        Set<Integer> check = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(check.contains(nums[i])) {
                return true;
            } else {
                check.add(nums[i]);
            }
        }

        return false;
 */

/*
  via HashMap and getOrDefault makes it only 33% speed


  if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        Map<Integer, Integer> checker = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            checker.put(current, 1 + checker.getOrDefault(current, 0));
            if (checker.get(current) > 1) {
                return true;
            }
        }

        return false;
 */


/*
 Arrays.sort 8,5%

 if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }

        return false;
 */