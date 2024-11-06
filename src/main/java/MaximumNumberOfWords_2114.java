public class MaximumNumberOfWords_2114 {

    public int mostWordsFound(String[] sentences) {
        int maxWordsNumber = 1;

        for (String sentence : sentences) {
            int currentWordsCounter = 1;
            for (int j = 0; j < sentence.length(); j++) {
                if (sentence.charAt(j) == ' ') currentWordsCounter++;
            }
            maxWordsNumber = Math.max(maxWordsNumber, currentWordsCounter);
        }

        return maxWordsNumber;
    }
}
