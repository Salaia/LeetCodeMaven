import java.util.*;

public class KeyboardRow_500 {
    Set<Character> first = new HashSet<>(Arrays.asList('q', 'Q', 'w', 'W', 'e', 'E', 'r', 'R', 't', 'T', 'y', 'Y', 'u', 'U', 'i', 'I', 'o', 'O', 'p', 'P'));
    Set<Character> second = new HashSet<>(Arrays.asList('a', 'A', 's', 'S', 'd', 'D', 'f', 'F', 'g', 'G', 'h', 'H', 'j', 'J', 'k', 'K', 'l', 'L'));
    Set<Character> third = new HashSet<>(Arrays.asList('z', 'Z', 'x', 'X', 'c', 'C', 'v', 'V', 'b', 'B', 'n', 'N', 'm', 'M'));

    public String[] findWords(String[] words) {
        List<String> checked = new ArrayList<>();

        for (String currentWord : words) {
            Character firstChar = currentWord.charAt(0);

            Set<Character> checkRow = new HashSet<>();
            if (first.contains(firstChar)) checkRow = first;
            else if (second.contains(firstChar)) checkRow = second;
            else if (third.contains(firstChar)) checkRow = third;

            boolean isOk = true;
            for (int i = 1; i < currentWord.length(); i++) {
                if (!checkRow.contains(currentWord.charAt(i))) {
                    isOk = false;
                    break;
                }
            }
            if (isOk) checked.add(currentWord);
        }
        return checked.toArray(new String[checked.size()]);

/*
        String[] result = new String[checked.size()];
        for (int i = 0; i < checked.size(); i++) {
            result[i] = checked.get(i);
        }
        return result;
*/

    }
}
