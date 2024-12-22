import java.util.HashMap;
import java.util.Map;

public class DecodeMessage_2325 {

    public String decodeMessage(String key, String message) {
        Map<Character, Character> keyMap = new HashMap<>();
        char charIndex = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && !keyMap.containsKey(key.charAt(i))) {
                keyMap.put(key.charAt(i), charIndex);
                charIndex++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') {
                builder.append(' ');
            } else {
                builder.append(keyMap.get(message.charAt(i)));
            }
        }
        return builder.toString();
    }
}
