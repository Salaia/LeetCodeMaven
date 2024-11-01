import java.util.ArrayList;
import java.util.List;

public class SummaryRanges_228 {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result;
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0]));
            return result;
        }

        StringBuilder builder = new StringBuilder();
        int head = nums[0];
        boolean isRange = false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1] +1) {
                isRange = true;
            } else {
                if (isRange) {
                    builder.append(head);
                    builder.append("->");
                    builder.append(nums[i - 1]);
                    result.add(builder.toString());
                    builder = new StringBuilder();
                    isRange = false;
                } else {
                    result.add(String.valueOf(head));
                }
                head = nums[i];
            }
        }

        if (isRange) {
            builder.append(head);
            builder.append("->");
            builder.append(nums[nums.length-1]);
            result.add(builder.toString());
        } else {
            result.add(String.valueOf(head));
        }


        return result;
    }
}
