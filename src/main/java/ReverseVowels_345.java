import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReverseVowels_345 {
    public String reverseVowels(String s) {
        /* из Солюшен. Если вместо сета использовать массив булевых
        (по умолчанию же false), в котором только по индексам гласных true,
        то обращение к массиву быстрее, чем проверка в сете. Но, имхо, в жопу такое.
        Даже с учетом того, что это из 5мс делает 2мс

        boolean[] vowels = new boolean[128];
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels[c] = true;
        }
         */
        Set<Character> vowels = new HashSet<>(List.of(
                'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O','u','U'));

        char[] reverser = s.toCharArray();
        int head = 0;
        int tail = reverser.length-1;
        while (head<tail) {
            if (!vowels.contains(reverser[head])) {
                head++;
            } else {
                while (!vowels.contains(reverser[tail])) {
                    tail--;
                }
                char tmp = reverser[head];
                reverser[head] = reverser[tail];
                reverser[tail] = tmp;
                tail--;
                head++;
            }
        }

        return String.valueOf(reverser);
    }
}
