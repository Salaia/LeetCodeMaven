public class AddBinary_67 {
    public String addBinary(String a, String b) {
        if (b.isEmpty()) return a;
        boolean isInMind = false;
        StringBuilder builder = new StringBuilder();
        if (b.length() > a.length()) {
            String tmp = a;
            a = b;
            b = tmp;
        }
        int aCurrent = a.length() - 1;
        int bCurrent = b.length() - 1;
        while (bCurrent >= 0) {
            if (a.charAt(aCurrent) == '0' && b.charAt(bCurrent) == '0' && !isInMind) {
                builder.append('0');
                aCurrent--;
                bCurrent--;
            } else if (a.charAt(aCurrent) == '1' && b.charAt(bCurrent) == '0' && !isInMind) {
                builder.append('1');
                aCurrent--;
                bCurrent--;
            } else if (a.charAt(aCurrent) == '1' && b.charAt(bCurrent) == '0' && isInMind) {
                builder.append('0');
                aCurrent--;
                bCurrent--;
            } else if (a.charAt(aCurrent) == '0' && b.charAt(bCurrent) == '1' && !isInMind) {
                builder.append('1');
                aCurrent--;
                bCurrent--;
            } else if (a.charAt(aCurrent) == '0' && b.charAt(bCurrent) == '1' && isInMind) {
                builder.append('0');
                aCurrent--;
                bCurrent--;
            } else if (a.charAt(aCurrent) == '0' && b.charAt(bCurrent) == '0' && isInMind) {
                builder.append('1');
                isInMind = false;
                aCurrent--;
                bCurrent--;
            } else if (a.charAt(aCurrent) == '1' && b.charAt(bCurrent) == '1' && !isInMind) {
                builder.append('0');
                isInMind = true;
                aCurrent--;
                bCurrent--;
            } else if (a.charAt(aCurrent) == '1' && b.charAt(bCurrent) == '1' && isInMind) {
                builder.append('1');
                aCurrent--;
                bCurrent--;
            }

        }

        for (int i = a.length() - b.length() - 1; i >= 0; i--) {
            if (isInMind && a.charAt(i) == '0') {
                builder.append('1');
                isInMind = false;
            } else if (isInMind && a.charAt(i) == '1') {
                builder.append('0');
            } else if (!isInMind && a.charAt(i) == '1') {
                builder.append('1');
            } else if (!isInMind && a.charAt(i) == '0') {
                builder.append('0');
            }
        }

        if (isInMind) {
            builder.append('1');
        }

        builder.reverse();
        return builder.toString();
    }

}
