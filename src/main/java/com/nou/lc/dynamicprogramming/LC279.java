package com.nou.lc.dynamicprogramming;

import java.util.Arrays;

/**
 * https://www.youtube.com/watch?v=HLZLwjzIVGo
 * https://leetcode.com/problems/perfect-squares/discuss/71495/An-easy-understanding-DP-solution-in-Java
 * 这个 discuss 里的代码居然比上面的视频里讲的清晰，但是
 * 视频里的画出那个树的举动确实非常容易加深理解
 * https://leetcode.com/problems/perfect-squares/discuss/71495/An-easy-understanding-DP-solution-in-Java
 */
public class LC279 {

    public int numSquares(int n) {

        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;

        // bottom to up calculate every value perfect square
        for(int i=1;i<=n;i++){

            int min = Integer.MAX_VALUE;
            int j=1;
            while (i-j*j>=0){

                // 这里是跟 min 进行比较，不是 dp[i]
                min = Math.min(dp[i-j*j]+1,min);
                j++;
            }
            dp[i] = min;

        }
        return dp[n];
    }
}
