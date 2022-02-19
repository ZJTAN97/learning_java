package SeanPrashadList.Easy.BestTimeStocks;

public class BestTimeStocks {

    static int maxProfit(int[] prices) {

        int profit = 0;
        // handling an exception case
        if(prices.length == 1) {
            return profit = 0;
        }

        int sell = prices[1]; // sell always after buy
        int buy = prices[0]; 

        int currProfit = 0;
        profit = sell - buy;

        for(int i=2; i < prices.length; i++) {
            // only if the sell value less than buy, we re-start from latest position
            if(sell < buy) {
                buy = sell;
                sell = prices[i];
            }
            sell = prices[i];
            currProfit = sell - buy;
            if(currProfit > profit) {
                profit = currProfit;
            }
        }
        if(profit < 0) {
            profit = 0;
        }

        return profit;
    }

    public static void main(String[] args) {
        
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int[] prices2 = {7, 6, 4, 3, 1};
        int[] prices3 = {1, 2, 3, 4, 5, 7, 9, 10};
        int[] prices4 = {7, 6, 4, 1, 2};
        int[] prices5 = { 1, 2 };
        int[] prices6 = { 2, 1 };
        maxProfit(prices6);

    }
}
