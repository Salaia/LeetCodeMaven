/*
    Мне нужен счетчик пробелов, иду по строке до нужного пробела,
    беру получившийся индекс и возвращаю подстроку до нужного индекса
 */
public class TruncateSentence_1816 {

    public String truncateSentence(String s, int k) {
        int counter = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                counter++;
                if (counter > k) {
                    return s.substring(0, i);
                }
            }
        }
        return s;
    }
}
