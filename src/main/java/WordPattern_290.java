import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern_290 {
    public boolean wordPattern(String pattern, String s) {

        List<Integer> pMask = new ArrayList<>();
        List<Integer> sMask = new ArrayList<>();

        Map<Character, Integer> pCodes = new HashMap<>();
        Map<String, Integer> sCodes = new HashMap<>();
        int code = 0;

        for (int i = 0; i < pattern.length(); i++) {
            Character ch = pattern.charAt(i);
            if (!pCodes.containsKey(ch)) {
                pCodes.put(ch, code);
                pMask.add(code);
                code++;
            } else {
                pMask.add(pCodes.get(ch));
            }
        }

        StringBuilder tmp = new StringBuilder();
        code = 0;
        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (!ch.equals(' ')) {
                tmp.append(ch);
            } else {
                String check = tmp.toString();
                if (!sCodes.containsKey(check)) {
                    sCodes.put(check, code);
                    sMask.add(code);
                    code++;
                } else {
                    sMask.add(sCodes.get(check));
                }
                tmp = new StringBuilder();
            }
        }

        String check = tmp.toString();
        if (!sCodes.containsKey(check)) {
            sCodes.put(check, code);
            sMask.add(code);
        } else {
            sMask.add(sCodes.get(check));
        }

        return pMask.equals(sMask);
    }
}
