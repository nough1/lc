package com.nou.lc.recusion;

/**
 * https://leetcode.com/problems/climbing-stairs/
 * climbing staircase
 * recursion
 */
public class LC70 {

    public int climbStairs(int n) {

        if(n<3){ return n; }
        int[] ways = new int[n+1];
        ways[0] = 0;
        ways[1] = 1;
        ways[2] = 2;
        for(int i=3;i<=n;i++){
            ways[i] = ways[i-1]+ways[i-2];
        }
        return ways[n];

    }
}
