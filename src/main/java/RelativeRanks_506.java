import java.util.*;

public class RelativeRanks_506 {

    public String[] findRelativeRanks(int[] score) {
        List<Integer> ranks = new ArrayList<>();
        for (int j : score) {
            ranks.add(j);
        }
        ranks.sort(Collections.reverseOrder());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < ranks.size(); i++) {
            map.put(ranks.get(i), i);
        }

        String[] result = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int rank = map.get(score[i]);
            switch (rank) {
                case 0:
                    result[i] = "Gold Medal";
                    break;
                case 1:
                    result[i] = "Silver Medal";
                    break;
                case 2:
                    result[i] = "Bronze Medal";
                    break;
                default:
                    result[i] = String.valueOf(rank+1);
            }
        }
        return result;
    }
}
