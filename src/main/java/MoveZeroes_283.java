import java.util.Arrays;

public class MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] !=0) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        int zeroes = nums.length - counter;
        int tail = nums.length-1;
        for (int i = 0; i < zeroes; i++) {
            nums[tail] = 0;
            tail--;
        }

    }
}
