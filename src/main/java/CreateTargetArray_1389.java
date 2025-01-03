import java.util.LinkedList;

public class CreateTargetArray_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> builder = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            if (index[i] == 0) {
                builder.addFirst(nums[i]);
            } else if (index[i] == index.length - 1) {
                builder.addLast(nums[i]);
            } else {
                builder.add(index[i], nums[i]);
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = builder.get(i);
        }
        return result;
    }
}
