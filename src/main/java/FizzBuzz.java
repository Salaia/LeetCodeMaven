import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
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
