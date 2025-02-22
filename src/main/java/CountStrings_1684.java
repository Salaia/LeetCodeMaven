import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountStrings_1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        Set<Character> checker = new HashSet<>();
        for (int i = 0; i < allowed.length(); i++) {
            checker.add(allowed.charAt(i));
        }
        boolean current = true;
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if(!checker.contains(words[i].charAt(j))) {
                    current = false;
                    break;
                }
            }
            if(current) counter++;
            current = true;
        }
        return counter;
    }
}
