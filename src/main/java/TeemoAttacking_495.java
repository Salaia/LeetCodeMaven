public class TeemoAttacking_495 {

    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length == 1) return duration;

        int result = 0;
        for (int i = 1; i < timeSeries.length; i++) {
            int diff = timeSeries[i] - timeSeries[i-1];
            if (diff >= duration) {
                result += duration;
            } else {
                result += diff;
            }
        }

        result += duration;
        return result;
    }
}
