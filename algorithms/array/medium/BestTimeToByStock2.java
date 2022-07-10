package array.medium;
//You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
//
//        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
//
//        Find and return the maximum profit you can achieve.
public class BestTimeToByStock2 {
    public int solution(int[] prices) {
        int max = 0;
        int k = 0;
        int head = prices[0];
        int tail = prices[prices.length - 1];
        int staticProfit = 0;
        int tempProfit = 0;
        // base case
        if (prices.length == 0)
            return 0;

        if (tail > head) {
            staticProfit = tail - head;
        }

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[k]) {
                tempProfit = prices[i] - prices[k];
                max = max + tempProfit;

            }

            k++;
        }

        if (max <= staticProfit) {
            max = staticProfit;
        }

        return max;
    }
}
