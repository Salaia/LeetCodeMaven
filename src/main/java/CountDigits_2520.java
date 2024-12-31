public class CountDigits_2520 {

    public int countDigits(int num) {
        int counter = 0;
        int current = num;
        while(current > 0) {
            if (num % (current % 10) == 0) {
                counter++;
            }
            current /= 10;
        }
        return  counter;
    }
}
