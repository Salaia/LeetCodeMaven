import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
        // Time is represented to nanosecond precision.
        // For example, the value "2nd October 2007 at 13:45.30.123456789" can be stored in a LocalDateTime.
        System.out.println(LocalDateTime.now());
        System.out.println("Over");
    }

    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean divThree = i % 3 == 0;
            boolean divFive = i % 5 == 0;

            String output = "";

             if (divThree) {
                output += "Fizz";
            }

             if (divFive) {
                 output += "Buzz";
            }

             if (output.isEmpty()) {
                output = String.valueOf(i);
            }

             answer.add(output);
        }
        return answer;
    }
}
