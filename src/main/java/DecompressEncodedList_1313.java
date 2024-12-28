import java.util.ArrayList;
import java.util.List;

public class DecompressEncodedList_1313 {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> builder = new ArrayList<>();
        for (int i = 0; i < nums.length-1; i+=2) {
            for (int j = 0; j < nums[i]; j++) {
                builder.add(nums[i+1]);
            }
        }

        int[] result = new int[builder.size()];
        for (int i = 0; i < builder.size(); i++) {
            result[i] = builder.get(i);
        }
        return result;
    }
}
