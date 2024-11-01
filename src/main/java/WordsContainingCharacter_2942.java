import java.util.ArrayList;
import java.util.List;

public class WordsContainingCharacter_2942 {

    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) != -1) { // ну или стрингу в чар-аррэй и руками... но лень
                result.add(i);
            }
        }
        return result;
    }
}
