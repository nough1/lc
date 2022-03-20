package com.nou.lc.greedy;

/**
 * https://leetcode.com/problems/jump-game-ii/
 * greedy or dynamic programming
 * breadth first scan
 */
public class LC45 {

    public int jump(int[] nums) {

        int minSteps = 0 ;

        int l=0,r=0;

        while (r<nums.length-1){

            int farthest = 0;

            for(int i=l;i<=r;i++){

                farthest = Math.max(farthest,nums[i]+i);

            }
            l= r+1;
            r = farthest;
            minSteps+=1;
        }
        return minSteps;
    }
}
