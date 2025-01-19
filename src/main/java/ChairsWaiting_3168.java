public class ChairsWaiting_3168 {

    public int minimumChairs(String s) {
        int total = 0;
        int available = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'E') {
                if (available > 0) {
                    available--;
                } else {
                    total++;
                }
            } else {
                available++;
            }
        }
        return total;
    }
}
