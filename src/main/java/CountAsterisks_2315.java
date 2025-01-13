public class CountAsterisks_2315 {

    public int countAsterisks(String s) {
        boolean doCount = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(doCount && ch == '*') {
                count++;
            } else if (doCount && ch == '|') {
                doCount = false;
            } else if (!doCount && ch =='|') {
                doCount = true;
            }
        }
        return count;
    }
}
