package com.nou.lc.dynamicprogramming;

/**
 * https://leetcode.com/problems/minimum-path-sum/discuss/344980/Java.-Details-from-Recursion-to-DP.
 * acwing https://www.acwing.com/video/1398/
 */
public class LC64 {

    public int minPathSum(int[][] grid) {

        int rows = grid.length;
        if(rows==0) {
            return 0 ;
        }
        int cols = grid[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++) {

                if(i==0 && j==0) {
                    result[i][j] = grid[i][j];
                }else if(i==0) {
                    result[i][j] =result[i][j-1]+grid[i][j];
                }else if(j==0) {
                    result[i][j] =result[i-1][j]+grid[i][j];
                }else {
                    result[i][j] = Math.min(result[i-1][j],result[i][j-1])+grid[i][j];
                }

            }

        return result[rows-1][cols-1];
    }
}

