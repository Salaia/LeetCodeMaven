public class RingsRods_2103 {
    public int countPoints(String rings) {
        int counter = 0;
        boolean isGreen = false;
        boolean isRed = false;
        boolean isBlue = false;
        int rod = 0;
        while (rod < 10) {
            for (int i = 1; i < rings.length(); i += 2) {
                if (rings.charAt(i) == '0' + rod) {
                    char ch = rings.charAt(i-1);
                    if (ch == 'R') {
                        isRed = true;
                    } else if (ch == 'B') {
                        isBlue = true;
                    } else if (ch == 'G') {
                        isGreen = true;
                    }
                    if (isBlue && isGreen && isRed) {
                        counter++;
                        break;
                    }
                }
            }
            isBlue = false;
            isGreen = false;
            isRed = false;
            rod++;
        }
        return counter;
    }
}
