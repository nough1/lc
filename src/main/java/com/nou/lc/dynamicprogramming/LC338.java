package com.nou.lc.dynamicprogramming;

/**
 * 总结规律的题目,-这个方案是高度总结过的
 * https://leetcode.com/problems/counting-bits/
 */
public class LC338 {

    public int[] countBits(int n) {

        int[] dp = new int[n+1];

        for(int i=1;i<=n;i++){

            dp[i] = dp[i/2]+i%2;
        }
        return dp ;
    }
}
