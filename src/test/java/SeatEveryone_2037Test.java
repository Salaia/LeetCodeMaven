import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatEveryone_2037Test {

    SeatEveryone_2037 se = new SeatEveryone_2037();

    @Test
    public void Test1() {
        int[] seats = {3,1,5};
        int[] students = {2,7,4};
        int expected = 4;
        int output = se.minMovesToSeat(seats, students);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        int[] seats = {4,1,5,9};
        int[] students = {1,3,2,6};
        int expected = 7;
        int output = se.minMovesToSeat(seats, students);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        int[] seats = {2,2,6,6};
        int[] students = {1,3,2,6};
        int expected = 4;
        int output = se.minMovesToSeat(seats, students);
        assertEquals(expected, output);
    }

}