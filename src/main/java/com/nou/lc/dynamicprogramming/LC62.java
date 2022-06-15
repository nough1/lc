package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/unique-paths/
 * ref : 自己做出来的解法
 * https://leetcode.com/problems/unique-paths/discuss/22954/C%2B%2B-DP
 *
 * 有种优化的解法可以用更少的内存在 discuss 里
 */
public class LC62 {

    public int uniquePaths(int m, int n) {


        int[][] result = new int[m][n];

        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){

                if(i==0 && (j==0||j==1)){
                    result[i][j] = 1;
                    continue;
                }
                int left = j-1>=0?result[i][j-1]:0;
                int top = i-1>=0?result[i-1][j]:0;
                result[i][j] = left+top;

            }
        return result[m-1][n-1];
    }
}
