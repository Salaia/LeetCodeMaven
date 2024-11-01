public class FlippingImage_832 {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                int tmp = image[i][j];
                int tailIndex = image[i].length - 1 - j;
                if (tailIndex < j) {
                    break;
                }
                // set head
                if (image[i][tailIndex] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
                // set tail
                if (tmp == 1) {
                    image[i][tailIndex] = 0;
                } else {
                    image[i][tailIndex] = 1;
                }
            }
        }

        return image;
    }
}
