package com.nou.lc.link;

/**
 * 买卖股票问题 , 思路:
 * 假设在这一天卖出，算一下在前面哪一天买入 ( 最小值的那一天 )
 */
public class LC121 {

    public int maxProfit(int[] prices) {

        int result = 0 ;

        int minBuyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){

            result= Math.max(result,prices[i]-minBuyPrice);
            minBuyPrice = Math.min(minBuyPrice,prices[i]);

        }

        return result;

    }
}
