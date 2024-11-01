import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StableMountains_3285Test {

    StableMountains_3285 sm = new StableMountains_3285();

    @Test
    public void Test1(){
        int[] height = {1,2,3,4,5};
        int threshold = 2;
        List<Integer> expected = List.of(3,4);
        List<Integer> output = sm.stableMountains(height, threshold);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test2(){
        int[] height = {10,1,10,1,10};
        int threshold = 3;
        List<Integer> expected = List.of(1,3);
        List<Integer> output = sm.stableMountains(height, threshold);
        assertIterableEquals(expected, output);
    }

    @Test
    public void Test3(){
        int[] height = {10,1,10,1,10};
        int threshold = 10;
        List<Integer> expected = List.of();
        List<Integer> output = sm.stableMountains(height, threshold);
        assertIterableEquals(expected, output);
    }
}