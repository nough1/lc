package com.nou.lc.dynamicprogramming;

/**
 * https://www.youtube.com/watch?v=73r3KWiEvyk
 * https://leetcode-cn.com/problems/house-robber/
 * though: paint the tree
 */
public class LC198 {

    public int rob(int[] nums) {

        // [pre2,pre1,n,n...]

        int pre2=0,pre1 = 0;

        for(int num:nums){

            int temp = Math.max(num+pre2,pre1);
            pre2 = pre1;
            pre1 = temp;

        }
        return pre1;
    }
}
