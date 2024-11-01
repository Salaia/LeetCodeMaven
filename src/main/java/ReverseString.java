
// 344
/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
 */
public class ReverseString {
    public void reverseString(char[] s) {
        char tmp;
        int head = 0; // можно оставить как единственный пойнтер, если...
        int tail = s.length-1; // вместо хвоста можно проверять, не дошли ли мы до середины,
        // а свапать пойнтер на "длина-1-пойнтер"
        // вместо while можно добавить рекурсивный метод, принимающий строку и пойнтер
        while (head < tail && head !=tail) {
            tmp = s[head];
            s[head] = s[tail];
            s[tail] = tmp;
            head++;
            tail--;
        }
        // return s; // for testing
    }
}
