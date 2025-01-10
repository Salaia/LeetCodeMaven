public class Maximum69Number_1323 {

    public int maximum69Number (int num) {
        // % 10 будет анализировать с конца, а мне нужна первая шестерка
        String str = String.valueOf(num);
        return Integer.parseInt(str.replaceFirst("6", "9"));
        // можно и руками идти по стринге, но лень
    }
}
