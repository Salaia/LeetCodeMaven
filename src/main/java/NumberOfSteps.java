public class NumberOfSteps {
    public int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 != 0) {
                num -= 1;
                steps++;
            }
            num = num / 2;
            if (num != 0) {steps++;}
        }

        return steps;
    }

    // То же самое, но с побитовыми операторами
    public int bitNumberOfSteps(int num) {
        int steps = 0;

        while (num > 0) {
            if ((num & 1) == 0) {
                // (num & 1) сравнивает правый бит, который у всех нечетных 1,
                // если совпадает, возвращает 1(true), остальные четные и делим на 2
                num >>= 1; // смещение всех битовых символов вправо дает результат деления на 2
            } else {
                num--;
            }
            steps++;
        }

        return steps;
    }

    public static void main(String[] args) {
        NumberOfSteps numberOfSteps = new NumberOfSteps();
        System.out.println(numberOfSteps.numberOfSteps(123));
        System.out.println(numberOfSteps.bitNumberOfSteps(123));
    }
}
