package com.nou.lc.dynamicprogramming;

/**
 * https://www.youtube.com/watch?v=oL6mRyTn56M
 * 作者用的二维表格的讲解方法确实很清晰,最关键的就是理清这个
 * 思路
 */
public class LC309 {

    public int maxProfit(int[] prices) {

        int hold = Integer.MIN_VALUE;
        int sold = 0;
        int rest = 0;

        for(int price:prices){



            int preSold = sold;
            // 已卖出这个状态比较特殊
            sold = hold+price;
            hold = Math.max(hold,rest-price);
            rest = Math.max(rest,preSold);

        }
        return Math.max(sold,rest);
    }
}
