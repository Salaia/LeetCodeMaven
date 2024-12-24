import java.util.Arrays;

public class ShuffleString_1528 {

    public String restoreString(String s, int[] indices) {
        char[] builder = new char[indices.length];
        for (int index : indices) {
            builder[indices[index]] = s.charAt(index);
        }
        return new String(builder);
    }
}
