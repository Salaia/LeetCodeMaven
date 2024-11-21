import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertTemperature_2469Test {

    ConvertTemperature_2469 ct = new ConvertTemperature_2469();

    @Test
    public void Test1() {
        double celsius = 36.50;
        double[] expected = {309.65000,97.70000};
        double[] output = ct.convertTemperature(celsius);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2() {
        double celsius = 122.11;
        double[] expected = {395.26000,251.79800};
        double[] output = ct.convertTemperature(celsius);
        assertArrayEquals(expected, output);
    }

}