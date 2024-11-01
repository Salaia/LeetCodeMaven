

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                for (int j = nums.length-1-counter; j >= 0; j--) {
                    if (j <= i) {
                        if (nums[j] == val) {
                            counter++;
                        }
                        return nums.length - counter;
                    }
                    if(nums[j] == val) {
                        counter++;
                    }
                    if (nums[j] != val) {
                        nums[i] = nums[j];
                        nums[j] = val;
                        counter++;
                        break;
                    }
                }
            }
        }
        return nums.length - counter;
    }
}

/*

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                counter++;
            } else if (counter > 0) {
                nums[i - counter] = nums[i];
            }
        }
            return nums.length - counter;
    }
}
*/

