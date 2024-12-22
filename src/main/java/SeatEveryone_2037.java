import java.util.Arrays;

public class SeatEveryone_2037 {

    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            if (students[i] != seats[i]) {
                moves += Math.abs(students[i] - seats[i]);
            }
        }
        return moves;
    }
}
