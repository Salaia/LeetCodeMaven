public class FinalPrices_1475 {

    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        boolean hasDiscount = false;
        for (int i = 0; i < prices.length-1; i++) {
            hasDiscount = false;
            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    hasDiscount = true;
                    result[i] = prices[i] - prices[j];
                    break;
                }
            }
            if(!hasDiscount) {
                result[i] = prices[i];
            }
        }
        result[prices.length-1] = prices[prices.length-1];
        return result;
    }
}
