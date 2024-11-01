import java.util.HashSet;
import java.util.Set;

public class DistributeCandies_575 {

    public int distributeCandies(int[] candyType) {
        if (candyType.length == 2) return 1;
        int allowed = candyType.length / 2;
        int countTypes = 0;
        Set<Integer> uniqueTypes = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            if (uniqueTypes.add(candyType[i])) {
                countTypes++;
                if (countTypes == allowed) return countTypes;
            }
        }

        return countTypes;
    }
}

