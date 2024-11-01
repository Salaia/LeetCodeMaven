import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfSeniorCitizens_2678Test {

    NumberOfSeniorCitizens_2678 sc = new NumberOfSeniorCitizens_2678();

    @Test
    public void Test1() {
        String[] input = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        int expected = 2;
        int output = sc.countSeniors(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test2() {
        String[] input = {"1313579440F2036","2921522980M5644"};
        int expected = 0;
        int output = sc.countSeniors(input);
        assertEquals(expected, output);
    }

    @Test
    public void Test3() {
        String[] input = {"5612624052M0130","5378802576M6424","5447619845F0171","2941701174O9078"};
        int expected = 2;
        int output = sc.countSeniors(input);
        assertEquals(expected, output);
    }

}