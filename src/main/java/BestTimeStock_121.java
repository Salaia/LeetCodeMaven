/**
 * нужно купить подешевле и продать подороже
 * То есть мне нужно:
 * - день покупки
 * - день продажи (чтобы купить ДО продажи)
 * - профит
 * <p>
 * Хотя зачем, логично же, что я оцениваю для покупки все дни, кроме последнего, а продаже - последующие
 * Так что у меня вложенный цикл.
 * Есть макспрофит, берем каждый день и сравниваем цены с последующими. Нашли профит больше - записали.
 * Дни-то возвращать меня никто не просит
 * <p>
 * Ok, что я могу оптимизировать?
 * За первый проход я могу найти максимум и минимум.
 * Если они в правильном порядке (минимальная цена до максимальной), сразу вернуть
 */

public class BestTimeStock_121 {

    public int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            int todayPrice = prices[i];
            if (todayPrice < buyPrice) {
                buyPrice = todayPrice;
            } else if (todayPrice - buyPrice > profit) {
                profit = todayPrice - buyPrice;
            }
        }
        return profit;
    }
}

/* Не прошло по Time Limit

int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) { // I don't buy on the last day
            for (int j = i+1; j < prices.length; j++) { // sell next days up to last
                int checkProfit = prices[j] - prices[i];
                if (checkProfit > maxProfit) {
                    maxProfit = checkProfit;
                }

            }
        }
        return maxProfit;
 */
