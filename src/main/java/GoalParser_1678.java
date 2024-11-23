public class GoalParser_1678 {

    public String interpret(String command) {
        StringBuilder resultBuilder = new StringBuilder();
        boolean isAl = false;
        for (int c = 0; c < command.length(); c++) {
            char ch = command.charAt(c);
            if (ch == 'G') {
                resultBuilder.append("G");
            } else if (ch == 'a') {
                isAl = true;
            } else if (ch == ')' && !isAl) {
                resultBuilder.append("o");
            } else if (ch == ')' && isAl) {
                resultBuilder.append("al");
                isAl = false;
            }
        }
        return resultBuilder.toString();
    }
}
