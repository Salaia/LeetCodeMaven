public class NumberOfEmployeesWhoMetTarget_2798 {

    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int counter = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                counter++;
            }
        }
        return counter;
    }
}
