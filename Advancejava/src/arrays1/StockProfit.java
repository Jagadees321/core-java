package arrays1;

public class StockProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        StockProfit stockProfit = new StockProfit();

        // Example 1
        int[] prices1 = {7, 1,5 , 3,4, 6, 4};
        System.out.println(stockProfit.maxProfit(prices1));  // Output: 7

        // Example 2
        int[] prices2 = {1, 2, 3, 4, 5};
        System.out.println(stockProfit.maxProfit(prices2));  // Output: 4
    }
}
