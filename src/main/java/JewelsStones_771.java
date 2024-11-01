import java.util.HashSet;
import java.util.Set;

public class JewelsStones_771 {

    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;

        Set<Character> jewelTypes = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            jewelTypes.add(jewels.charAt(i));
        }

        for (int i = 0; i < stones.length(); i++) {
            if (jewelTypes.contains(stones.charAt(i))) counter++;
        }

        return counter;
    }
}
