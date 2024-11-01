import java.util.*;

/**
 * Given a string s, find the first non-repeating character in it and return its index.
 * If it does not exist, return -1.
 * <p>
 * Первая буква может казаться уникальной до последней, где ей найдется пара,
 * так что без полного прохода по строке не получится
 * <p>
 * Переложить в мапу со счетчиками повторений, взять значения со счетчиком 1,
 * идти по строке пока не найдешь первое совпадение из сета
 * <p>
 * Или LinkedHashMap, и вернуть первый счетчик 1
 * <p>
 * Или вложить в value мапы массив из 2 интов: первый индекс+счетчик, и обновлять минимум счетчика
 */

/*public class FirstUniqueChar_387 {
    public int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.lastIndexOf(c,s.lastIndexOf(c) - 1) < 0){
                return i;
            }
        }
        return -1;
    }
}*/

public class FirstUniqueChar_387 {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char ch = array[i];
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1) {
                return i;
            }
        }

        return -1;
    }
}

/*
public class FirstUniqueChar_387 {
    public int firstUniqChar(String s) {
        Map<Character, ArrayList<Integer>> chars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!chars.containsKey(ch)) {
                chars.put(ch, new ArrayList<>(List.of(1, i)));
            } else {
                ArrayList<Integer> tmpList = chars.get(ch);
                tmpList.add(0, tmpList.get(0) + 1);
                chars.put(ch, tmpList);
            }
        }
        int result = s.length();
        for (Map.Entry<Character, ArrayList<Integer>> entry : chars.entrySet()) {
            ArrayList<Integer> tmp = entry.getValue();
            if (tmp.get(0) == 1 && tmp.get(1) < result) {
                result = tmp.get(1);
            }
        }

        return result < s.length() ? result : -1;
    }
}*/


/* HashMap + повторное прохождение по стринге
Map<Character, Integer> chars = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            chars.put(ch, chars.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (chars.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
 */
