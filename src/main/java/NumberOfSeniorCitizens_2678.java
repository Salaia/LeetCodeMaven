public class NumberOfSeniorCitizens_2678 {
    public int countSeniors(String[] details) {

        int seniors = 0;
        for (String detail : details) {
            int age = Integer.parseInt(detail.substring(11, 13));
            if (age > 60) seniors++;
        }
        return seniors;
    }
}
