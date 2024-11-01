import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlippingImage_832Test {

    FlippingImage_832 fi = new FlippingImage_832();

    @Test
    public void Test1(){
        int[][] input = {{1,1,0}, {1,0,1},{0,0,0}};
        int[][] expected = {{1,0,0},{0,1,0},{1,1,1}};
        int[][] output = fi.flipAndInvertImage(input);
        assertArrayEquals(expected, output);
    }

    @Test
    public void Test2(){
        int[][] input = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int[][] expected = {{1,1,0,0},{0,1,1,0},{0,0,0,1},{1,0,1,0}};
        int[][] output = fi.flipAndInvertImage(input);
        assertArrayEquals(expected, output);
    }

}