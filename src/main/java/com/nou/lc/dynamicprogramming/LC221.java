package com.nou.lc.dynamicprogramming;

/**
 * https://www.youtube.com/watch?v=6X7Ha2PrDmM
 *
 * https://leetcode.com/problems/maximal-square/
 *
 * https://leetcode.com/problems/maximal-square/discuss/600149/Python-Thinking-Process-Diagrams-DP-Approach
 *
 * 这个 discuss 写的不错
 */
public class LC221 {

    public int maximalSquare(char[][] matrix) {


        int maxSquare = 0;

        if(matrix.length==0){
            return maxSquare;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new  int[m+1][n+1];
        for(int i=1;i<=m;i++)
            for(int j=1;j<=n;j++){

                if(matrix[i-1][j-1]=='1'){

                    // 这里为什么是 dp[i][j]呢， 为什么不是 dp[i-1][j-1]
                    dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
                    maxSquare = Math.max(maxSquare,dp[i][j]);
                }
            }

        return maxSquare*maxSquare;

    }
}
