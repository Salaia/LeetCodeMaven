import java.util.List;

public class CountItems_1773 {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int ruleIndex = -1;
        switch (ruleKey) {
            case "type" -> ruleIndex = 0;
            case "color" -> ruleIndex = 1;
            case "name" -> ruleIndex = 2;
            default -> ruleIndex = -2;
        }

        int counter = 0;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).get(ruleIndex).equals(ruleValue)) counter++;
        }

        return counter;
    }
}
