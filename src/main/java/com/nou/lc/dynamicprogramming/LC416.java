package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/partition-equal-subset-sum/
 * 二维数组的解法理解了，重点是找出转移公式
 */
public class LC416 {

    public boolean canPartition(int[] nums) {

        int sum = 0 ;

        for(int num:nums){
            sum+=num;
        }
        if((sum&1)==1){
            return false;
        }
        sum/=2;
        int length = nums.length;
        boolean[][] dp = new boolean[length+1][sum+1];
        dp[0][0] = true;
        for(int i=1;i<=sum;i++){
            dp[0][i] = false;
        }
        for(int i=1;i<=length;i++){
            dp[i][0] = true;
        }
        for(int i=1;i<=length;i++)
            for(int j=1;j<=sum;j++){

                dp[i][j] = dp[i-1][j];
                if(j>=nums[i-1]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i-1]];
                }

            }

        return dp[length][sum];
    }
}
