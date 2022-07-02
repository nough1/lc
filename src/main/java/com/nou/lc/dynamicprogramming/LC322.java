package com.nou.lc.dynamicprogramming;

import java.util.Arrays;

/**
 * 还是决策树的做法，每一条路径都尝试一种
 * 硬币，看最小值分别是什么， 然后问题
 * 转换成每一种金额的最小硬币数是多少
 *
 */
public class LC322 {

    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int i=1;i<=amount;i++)
            for(int coin:coins){

                if(i-coin>=0){
                    dp[i] = Math.min(dp[i],dp[i-coin]+1);
                }

            }
        return dp[amount]==(amount+1)?-1:dp[amount];
    }
}
