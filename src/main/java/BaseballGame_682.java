import java.util.ArrayList;
import java.util.List;

/**
 *  Для начала написала через ArrayList.
 *  В теории это можно бы решить через LinkedList, а лучше - через Stack,
 *  потому что все операции в конце списка происходят
 *  Но сначала хочу увидеть, что решение работает.
 */

public class BaseballGame_682 {
    public int calPoints(String[] operations) {
        List<Integer> scores = new ArrayList<>();

        for (String operation : operations) {
            switch (operation) {
                case "+":
                    Integer sum = scores.get(scores.size()-1) + scores.get(scores.size()-2);
                    scores.add(sum);
                    break;
                case "D":
                    Integer twice = scores.get(scores.size()-1) * 2;
                    scores.add(twice);
                    break;
                case "C":
                    scores.remove(scores.size()-1);
                    break;
                default:
                    scores.add(Integer.valueOf(operation));
            }
        }

        Integer result = 0;
        for (Integer score : scores) {
            result += score;
        }

        return result;
    }
}
