public class FinalValue_2011 {

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String str : operations) {
            if (str.charAt(1) == '-') {
                result--;
            } else {
                result++;
            }
        }
        return result;
    }
}
