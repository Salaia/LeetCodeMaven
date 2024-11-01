import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    public static boolean canConstructCombine(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            alphabets_counter[c - 'a']++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (alphabets_counter[c - 'a'] == 0) return false;
            alphabets_counter[c - 'a']--;
        }
        return true;
    }

    /*
Официальное решение. Runtime 16ms, Memory 45.18 Mb
 */
    public static boolean canConstructGood(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            int currentCount = magazineLetters.getOrDefault(m, 0);
            magazineLetters.put(m, ++currentCount);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);
            if (currentCount == 0) {
                return false;
            }
            magazineLetters.put(r, --currentCount);
        }
        return true;
    }

    public static boolean canConstructBad(String ransomNote, String magazine) {
        /* Метод работает, но фигово, потому что я не смогла придумать,
         как максимально продуктивно использовать мапу:
         я сделала полную копию газеты, добавив ей ключи-индексы,
         а надо было сделать счетчик частоты повторения букв в газете с ключами-буквами
         Runtime 1771 ms, memory 47.7 Mb */
        Map<Integer, Character> magazineMap = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            magazineMap.put(i, magazine.charAt(i));
        }
        // StringBuilder result = new StringBuilder();
        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            Integer magazineIndex = -1;
            if (!magazineMap.containsValue(ch)) {
                //System.out.println("Breaking on: " + result);
                return false;
            } else {
                for (Map.Entry<Integer, Character> entry : magazineMap.entrySet()) {
                    if (entry.getValue().equals(ch)) {
                        magazineIndex = entry.getKey();
                    }
                }
                magazineMap.remove(magazineIndex);
                // result.append(ch);
                //System.out.println("Continue at: " + result);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstructBad("aa", "aab"));
        System.out.println(canConstructBad("a", "b"));
        System.out.println(canConstructGood("a", "b"));
        System.out.println(canConstructGood("aa", "aab"));
    }

    /*
    Решение пользователя ЛитКода, без мапы (что нужно было в задании, но не требовалось в тестах)
    Тот же счетчик повторяемости букв, только не в мапе, а в массиве
    Runtime 1ms, Memory 44.64 Mb
     */
    public boolean canConstructArray(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c - 'a']++;

        for (char c : ransomNote.toCharArray()) {
            if (alphabets_counter[c - 'a'] == 0) return false;
            alphabets_counter[c - 'a']--;
        }
        return true;
    }

    /*
    Точнее, оно было лучшим (литкод выдает этот пример как 0 мс), но сейчас бегает со скоростью
    самого популярного
    кстати вообще не понимаю, как оно работает
     */
    public boolean canConstructBest(String ransomNote, String magazine) {
        int[] alphabets = new int[26]; // повторяемость
        for (char ch : ransomNote.toCharArray()) {
            /*
            Вот ниже это что? magazine.indexOf - метод стринги,
            принимает букву и индекс, с которого начинать поиск
            буква ок
            какая связь между счетчиком повторений alphabets[ch - 'a'] и индексом в стринге-источнике?!
             */
            alphabets[ch - 'a'] = magazine.indexOf(ch, alphabets[ch - 'a']);
            /*
             и тут не понимаю: строкой выше мы могли получить -1, если буквы в источнике нет
             но в условии мы увеличиваем -1 на +1 и получаем 0, как вот тут может получиться < 0 ???
             */
            if (alphabets[ch - 'a']++ < 0)
                return false;
        }
        return true;
    }

}

// Если просто contains, то будет искать соответствие подряд,
// а мне можно буквы в рандомном порядке

            /*
            1. Разбить обе стринги на чарсет
            2. Ищем первую букву "записки", находим, вырезаем из "газеты", переходим к следующей букве "записки"
            Если буква не нашлась - выходим с false. Если записка успешно составилась - true.

            Остался вопрос: при чем тут мапа? Разве что быстрее будет, если вместо чарсета
            переложить газету в мапу индекс-буква, искать по значению, удалять по ключу.
            А стринга умеет "взять следующую букву?
             */
